# Jantar dos Filósofos

Este é Simula o problema clássico do **Jantar dos Filósofos**, onde filósofos alternam entre comer e pensar.

## Descrição

No problema, cinco filósofos estão sentados em uma mesa circular com cinco garfos. Cada filósofo precisa de dois garfos (um à esquerda e um à direita) para comer. Após comer, o filósofo libera os garfos para que outros possam usá-los.

### Ideia inicial:

- Cada filósofo começa com apenas um garfo.
- O **Filósofo 0** passa o seu garfo para o próximo filósofo (Filósofo 1).
- O **Filósofo 1** pega os dois garfos e come. Após comer, ele passa o garfo esquerdo de volta ao Filósofo 0 e o garfo direito ao Filósofo 2.
- O processo se repete até que todos os filósofos tenham comido.

### Condições do programa:

- Um filósofo só pode comer quando tiver ambos os garfos (esquerdo e direito).
- Quando o filósofo termina de comer, ele devolve os garfos para para a mesa.
- O jantar termina quando todos os filósofos comerem ao menos uma vez.

## Imagem
<div align="center">
<img src="https://github.com/user-attachments/assets/8a648ab1-2e53-415a-8780-c020e5962f12" width="700px"/>
 
</div>
