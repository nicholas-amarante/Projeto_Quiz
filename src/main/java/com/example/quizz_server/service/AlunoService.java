package com.example.quizz_server.service;

import com.example.quizz_server.dto.AlunoCreateDTO;
import com.example.quizz_server.model.Aluno;
import com.example.quizz_server.repository.AlunoRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;
    private final PasswordEncoder passwordEncoder;
    
    public AlunoService(AlunoRepository alunoRepository, PasswordEncoder passwordEncoder) {
        this.alunoRepository = alunoRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Transactional
    public Aluno criarAluno(AlunoCreateDTO alunoDTO){
        Aluno novoAluno=new Aluno();
        novoAluno.setNomeCompleto(alunoDTO.getNomeCompleto());
        novoAluno.setEmail(alunoDTO.getEmail());
        String senhaCriptografada=passwordEncoder.encode(alunoDTO.getSenha());
        novoAluno.setSenhaHash(senhaCriptografada);
        novoAluno.setTipo_perfil(alunoDTO.getTipoPerfil());
        novoAluno.setMatricula(alunoDTO.getMatricula());
        novoAluno.setData_nascimento(alunoDTO.getDataNascimento());
        return alunoRepository.save(novoAluno);
    }

    @Transactional
    public Aluno buscarPorId(Long id){
        return alunoRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Aluno não encontrado pelo ID: "+id));
    }

    @Transactional
    public List<Aluno> buscarTodosAlunos(){
        return alunoRepository.findAll();
    }

    @Transactional
    public Aluno buscarPorNome(String nome){
        return alunoRepository.findByNomeCompleto(nome);
    }

    @Transactional
    public Aluno atualizarAluno(Long id){
        return alunoRepository.save(buscarPorId(id));
    }

    @Transactional
    public void deletarAluno(Long id){
        alunoRepository.deleteById(id);
    }
}
