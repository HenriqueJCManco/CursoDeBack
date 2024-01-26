let numeroSecreto = gerarNumeroAleatorio();
let tentativas = 1;
let numeroMax = 10;
console.log(numeroSecreto);

exibirmensagemInicial();

function verificarChute(){
    let chute = document.querySelector('input').value;
    if (chute == numeroSecreto){
        exibirTexto('h1', 'Parabéns, você acertou!');
        let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';
        let mensagemTentativas = `Você descobriu o número secreto com ${tentativas} ${palavraTentativa}`;
        exibirTexto('p', mensagemTentativas);
        document.getElementById('reiniciar').removeAttribute('disabled');
    } else {
        if (chute > numeroSecreto){
            exibirTexto('h1', `Você errou, o número secreto é menor que ${chute}`);
        } else{
            exibirTexto('h1', 'Você errou, o número secreto é maior que ' + chute);
        }
        tentativas++;
        limparCampo();
    }
}

function limparCampo(){
    chute = document.querySelector('input');
    chute.value = '';
}

function exibirTexto(tag, texto){
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}


function gerarNumeroAleatorio(){
   return parseInt(Math.random() * 10 + 1);
}

function reiniciarJogo(){
    numeroSecreto = gerarNumeroAleatorio();
    limparCampo();
    tentativas = 1;
    exibirTexto('h1', 'Jogo do número secreto' );
    exibirTexto('p', 'Escolha um número entre 1 e ' + numeroMax);
    document.getElementById('reiniciar').setAttribute('disabled', true);
}

function exibirmensagemInicial(){
    exibirTexto('h1', 'Jogo do número secreto' );
    exibirTexto('p', 'Escolha um número entre 1 e ' + numeroMax);
}