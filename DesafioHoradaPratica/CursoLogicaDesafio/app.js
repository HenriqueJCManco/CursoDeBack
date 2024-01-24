let titulo = document.querySelector('h1');
titulo.innerHTML = 'Hora do Desafio';

function verificarBotao(){
   console.log('Botão Clicado'); 
}

function botaoAlert(){
    alert('Eu amo JS');
}

function botaoPrompt(){
    let cidade = prompt('Fale alguma cidade do Brasil');
    alert(`Estive em ${cidade} e lembrei de você`)
}

function botaoSoma(){
    let num1 = prompt('Digite o primeiro número: ');
    let num2 = prompt('Digite o segundo número: ');
    let soma = parseInt(num1) + parseInt(num2);
    alert(`A soma do ${num1} com ${num2} é ${soma}`);
}