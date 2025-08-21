document.addEventListener('DOMContentLoaded', function() {
    console.log('JavaScript carregado com sucesso via PHP!');
    const botao = document.getElementById('botao');
    if (botao) {
      botao.addEventListener('click', () => {
        alert('Você clicou no botão!');
      });
    }
  });
  