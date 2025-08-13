const input=document.querySelector('input')
input.addEventListener('focus', ()=>{
    if(input.value===''){
        input.value='Texto padrão'
    }
});
input.addEventListener('blur', ()=>{
    if (input.value==='Texto padrão'){
        input.value='';
    }
});