package com.example.quizz_server.controller;
import com.example.quizz_server.dto.AlunoCreateDTO;
import com.example.quizz_server.model.Aluno;
import com.example.quizz_server.repository.AlunoRepository;
import com.example.quizz_server.response.AlunoResponseDTO;
import com.example.quizz_server.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    private final AlunoService alunoService;
    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoService alunoService, AlunoRepository alunoRepository) {
        this.alunoService = alunoService;
        this.alunoRepository = alunoRepository;
    }

    @PostMapping
    public ResponseEntity<AlunoResponseDTO> criarAluno(@Valid @RequestBody AlunoCreateDTO alunoCreateDTO) {
        Aluno novoAluno = alunoService.criarAluno(alunoCreateDTO);
        AlunoResponseDTO responseDTO = new AlunoResponseDTO(novoAluno);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoResponseDTO> buscarAlunoPorId(@PathVariable Long id){
        Aluno novoaluno=alunoService.buscarPorId(id);
        AlunoResponseDTO responseDTO = new AlunoResponseDTO(novoaluno);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<AlunoResponseDTO>> listarTodosAluno(){
        List<Aluno> alunos=alunoService.buscarTodosAlunos();
        List<AlunoResponseDTO> responseDTOS=alunos.stream().map(AlunoResponseDTO::new).collect(Collectors.toList());
        return new ResponseEntity<>(responseDTOS, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoResponseDTO> atualizarAluno(@PathVariable Long id, @Valid @RequestBody Aluno aluno){
        Aluno alunoAtualizado=alunoService.atualizarAluno(id);
        AlunoResponseDTO responseDTO=new AlunoResponseDTO(alunoAtualizado);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAluno(@PathVariable Long id){
        alunoService.deletarAluno(id);
        return ResponseEntity.noContent().build();
    }
}
