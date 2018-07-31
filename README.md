# mobile-os-ultimate


O aplicativo MobileOS Ultimate é responsável pelo controle e acompanhamento da execução das Ordens de Serviços em campo. 
A partir desse aplicativo, é possível ir a campo com todas as informações referente aos serviços que serão executados 
sem a necessidade de papel.

Na versão para dispositivo móvel do MobileOS o usuário poderá controlar todas as etapas de execução de uma Ordem de Serviço. 
Tempo de execução do serviço, material que foi utilizado em campo, valas, dados da rede são alguns das informações que podem ser coletadas utilizando-se de um dispositivo móvel com sistema operacional Android.

Os principais serviços que são contemplados pelo MobileOS for Android são:

• Serviços relacionadas a Manutenção de Rede ou Ramal;

• Serviços relacionados a Corte ou Supressão;

• Serviços relacionados a Ligação Nova;

• Serviços relacionados a Instalação de Hidrômetro;

• Serviços relacionados a Substituição de Hidrômetro.

O software é integrado com a sistema GSAN via Webservice ou via arquivo texto.



# A versão Ultimate está divida em três módulos:

1. Back-end em Java (Spring Boot) com banco de dados Postgres;
2. Front-end em React;
3. Aplicação Móvel em Android


Nessa versão será possível gerenciar todas as etapas relacionadas a Gestão de Serviços de uma empresa de Saneamento. A solução poderá trabalhar isolada ou integrada a um software comercial voltado para Saneamento. Inicialmente, a versão Mobile era voltada e integrada ao Sistema GSAN (https://softwarepublico.gov.br/social/gsan).


Algumas das funcionalidades que serão contempladas pela aplicação:
1. Cadastrar os materiais necessários e a quantidade necessária para executar um determinado tipo de serviço;
2. Cadastrar as Equipes e as caracteristicas de cada Equipe; ou seja, o sistema poderá cadastrar os tipos de serviços que cada equipe poderá executar. Além disso, a aplicação irá permitir cadastrar os componentes que compôem a equipe.
3. Cadastrar os tempos necessários para executar determinado Tipo de Serviço;
4. Configurar prioridade de execuço de determinado Tipo de Serviço;
5. Módulo de Programação de Ordem de Serviço;
6. Possibilidade de troca de mensagem entre equipe de campo e equipe de programação;
7. Emissão de Relatório Fotográfico que mostrará os serviços que foram executados em campo e as fotos que foram capturadas em campo;
8. Roteirização baseada no melhor roteiro (melhor rota);
9. Baixa automatica da Ordem Serviço e geração de serviços automáticos como Religação;
10. Inclusão ou criação de Ordem Serviço para determinada Equipe em um roteiro já elaborado;
11. Opção para exibir a rota a ser seguida para execução de determinada Ordem de Serviço no aplicativo móvel;
12. Integração do aplicativo móvel com gateway de pagamento a ser utilizado para o pagamento de Faturas em Atraso ou Ordem de Corte;
13. Captura de fotos para comprovar a executação ou não de determinada Ordem de Serviço bem como assinatura do cliente quando for necessário;
14. Integração do aplicativo móvel com gateway de envio de SMS para enviar mensagem para determinados clientes. Exemplo: aviso de fatura em atraso, aviso de corte etc;
15. Funcionalidade que permita que a Equipe de Campo possa criar uma nova Ordem de Serviço após permissão da Equipe de Programação;
16. Funcionalidade que possa permitir que a Equipe de Campo possa informar determinadas paradas. Exemplo: parada por falta de equipamento, falta de material etc;
17. Funcionalidade que permita a equipe de gestão de serviço monitorar o posicionamento da equipe em campo de forma visual utilizando Mapa como Google Maps ou outro componente de mapa;
18. O aplicativo móvel poderá se conectar a uma empresa bluetooth para imprimir Ordem de Serviço em campo;
19. Transferência de dados entre aplicativo móvel e sevidor de forma segura utilizando criptografia de dados;
20. Transferência automaticamente de dados do aplicativo móvel para o servidor;
21. Funcionalidade para controlar o Kit de material disponível para determinada equipe;
22. Funcionaldiade para a equipe de campo possa informar a quilometragem.


