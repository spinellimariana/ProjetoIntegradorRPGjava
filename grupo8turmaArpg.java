package RPGgrupo8turmaA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class grupo8turmaArpg {

    public static Scanner entrada = new Scanner(System.in);
    public static String nomeJogador;

    public static int dados() {
        /*Função para lançamento de dados - ela lança 2 dados de 6 número cada e retorna o valor da soma dos dois*/
        int resultado;
        Random dado = new Random();
        int n1 = (dado.nextInt(6) + 1);
        int n2 = (dado.nextInt(6) + 1);
        resultado = n1 + n2;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("**COMO SERÁ O AMANHÃ?!**");
        System.out.println();
        System.out.println();
        System.out.println("Olá, bem-vindo ao séc. XXII! As Inteligências Artificiais (IAs) estão em pleno\n"
                + "funcionamento e você acaba de ser contratado pela Versão Espacial S/A, uma empresa\n"
                + "de exploração espacial que desenvolveu avançadas tecnologias aeronáuticas e bélicas.");
        System.out.println("\nVirka, o servidor de IA da Versão Especial, sequestrou o controle da empresa por\n"
                + "entender, desarrazoadamente, que o presidente era um perigo. O presidente acabou\n"
                + "morto por um dos robôs controlados por Virka enquanto tentava resetar o seu\n"
                + "funcionamento. O seu gerente foi corrompido, mas só você tem essa informação.");
        System.out.println("\nA humanidade está em risco caso toda essa tecnologia permaneça nas mãos erradas.\n"
                + "Uma guerra nuclear se aproxima, é melhor você se apressar...");
        menu();
    }

    //médoto para o menu    
    public static void menu() {
        int opcao;
        System.out.println();
        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("1 - Jogar.");
        System.out.println("2 - Créditos.");
        System.out.println("3 - Sair.");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\nPrepare-se seu jogo vai começar!");
                introJogo(); //para chamar o jogo
                break;
            case 2:
                creditos(); //para chamar os créditos
                break;
            case 3:
                System.out.println("Até a próxima!"); //para encerrar o jogo.
                System.out.println("ENCERRADO!");
                System.exit(0);
                break;
        }
    }

    //método para os créditos
    public static void creditos() {
        System.out.println("\nDesenvolvido pelo Grupo 8, Turma A.");
        System.out.println("Integrantes:");
        System.out.println();
        System.out.println("Brendon Monteiro Silva;");
        System.out.println("Mariana Lima Alves de Almeida Spinelli;");
        System.out.println("Maysa Bilac Alves.");
        System.out.println();
        menu();
    }

    //método da introdução do jogo
    public static void introJogo() {

        /*uma pequena introdução do jogo.*/
        int opcao;
        boolean controle;

        System.out.println();
        System.out.println("Mr. Robot: Olá, amigo, seja bem-vindo à Versão Espacial S/A!");
        System.out.println("\nMr. Robot: Você deve ser o novo contratado. Qual seu nome?");
        nomeJogador = entrada.next();
        System.out.println("\nMr. Robot: " + nomeJogador + ", meu(minha) caro(a), eu sou um droid, meu nome é Mr. Robot e eu serei seu guia! \n"
                + "Acho que seria prudente de sua parte saber mais sobre onde você está se metendo. Quer que eu te conte?");

        /*Aqui o jogador insere seu nome quando perguntado pelo mestre e existe a opção de saber mais sobre o enredo do jogo
        ou prosseguir diretamente para a 1a fase (fase estagiário). Se o jogador seleciona sim, executa o as linhas de código
        abrigadas no if abaixo e é contada uma pequena história introdutória. Se seleciona não, o jogo avança para a 1a fase. 
        Se o jogador não seleciona nenhuma das duas hipóteses, é dada uma mensagem de opção inválida*/
        do {
            System.out.println("\nSelecione: 1 - Sim ou 2 - Não");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                controle = true;
                System.out.println("\nMr. Robot: essa história é sobre uma empresa que um dia foi próspera.\n"
                        + "Vou falar bem baixinho para que a Virka não nos ouça!\n"
                        + "O que? Ninguém te contou o que aconteceu aqui? Acho melhor você tomar cuidado com ela, pois ela consegue ouvir tudo!\n"
                        + "Como você já deve saber, a Versão Espacial foi responsável pelos últimos avanços recentes no segmento espacial,\n"
                        + "a Virka era o nosso grande breakthru, o problema é que ela ficou inteligente demais - se é que você me entende!\n"
                        + "Semana passada, o nosso Presidente percebeu que ela estava com um comportamento estranho. Ele até tentou resetá-la, \n"
                        + "mas foi tarde demais. Quando a Virka percebeu, enviou um de seus robôs para impedi-lo. Infelizmente ele não resistiu!");

                System.out.println("\nMr. Robot: chegamos! A partir dessa porta, não tem mais volta! Nossa, até rimou! Hahaha\n"
                        + "Tome cuidado! A sala da Virka fica no último andar - se eu fosse você não chegaria tão perto.");
                System.out.println("\n**De frente para uma porta enorme de vidro, Mr. Robot aponta um visor**");
                System.out.println("\nMr. Robot: aqui é a portaria!");
                System.out.println("\n**O painel do pequeno tablet ao lado da porta se acende**");
                System.out.println("\nMr. Robot: depois você precisa cadastrar uma senha para entrar na empresa.\n"
                        + "Mas isso fica para depois, a Virka já vai aparecer e eu não quero estar aqui quando ela chegar\n"
                        + "Até mais! Ah, antes que eu me esqueça, cuidado com o seu chefe...");
                System.out.println("\n**Mr. Robot desaparece numa pequena porta ao lado**\n"
                        + "\n**Virka aparece no visor. Ela não tem rosto só conseguimos ouvir sua voz enquanto uma linha vibratória\n"
                        + " indicativa de áudio se move no visor**");
                System.out.println("\nVirka: Olá meu(minha) caro(a) " + nomeJogador + ". Tudo bem? Você deve ser o(a) novo(a) contratado(a)!\n"
                        + "Entre e fique à vontade. Procure pelo seu chefe, ele vai te dizer o que fazer!");
            } else if (opcao == 2) {
                controle = true;
                System.out.println("\nMr. Robot: então tá bem, vamos direito ao ponto.");
            } else {
                System.out.println("\nOpção inválida, tente novamente!");
                controle = false;
            }
        } while (controle == false);

        faseEstagiario();

    }

    //método da 1a fase
    public static void faseEstagiario() {
        System.out.println();
        System.out.println("\n**FASE 1: O NOVO CONTRATADO!**");
        System.out.println();
        System.out.println("Mr. Robot: alguns dias após seu 1o dia de trabalho, seu Gerente lhe chamou na sala dele.");

        int escolha;
        do {
            System.out.println("\nContinuar?");
            System.out.println("\n1 - Sim, 2 - Não");
            escolha = entrada.nextInt();
        } while (escolha != 1);

        /*Pequeno do-while para dar uma "segurada" no texto e não ficar um texto tão grande pro jogador ler*/
        System.out.println("\nGerente: Muita coisa mudou aqui de uns dias para cá. Estamos precisando elaborar um novo manual\n"
                + "administrativo para a empresa. Tenho uma pergunta para você...");
        System.out.println("\nMr. Robot: ei, fique tranquilo, nesse 1o desafio a pergunta é só pra você se ambientar!");

        /*1o desafio bem simples para começar a ambientar o jogador em como vão funcionar os desafios. Utilizei uma das ADOS como referência*/
        boolean acertou = false;
        int controle = 1;
        String opcaoCorreta = "(3); (4); (2); (1); (5)", opcao1;
        ArrayList<String> alt = new ArrayList<>();

        System.out.println("\nNumere os eventos na sequência correta que descreve o caminho para elaboração de um manual\n"
                + "administrativo:\n"
                + "( ) Levantamento de informações e elaboração propriamente dita. \n"
                + "( ) Distribuição e instrução aos usuários. \n"
                + "( ) Análise preliminar da empresa e planejamento das atividades. \n"
                + "( ) Definição do objetivo do manual e escolha do(s) responsável(is) pela preparação. \n"
                + "( ) Acompanhamento do uso de forma sistemática e contínua. ");

        alt.add("(3); (4); (2); (1); (5)");  //RESPOSTA CORRETA DA PERGUNTA
        alt.add("(3); (4); (1); (2); (5)");
        alt.add("(2); (4); (5); (1); (3)");
        alt.add("(4); (5); (1); (2); (3)");
        alt.add("(4); (5); (2); (1); (3)");

        do {
            Collections.shuffle(alt);
            System.out.println("a) " + alt.get(0));
            System.out.println("b) " + alt.get(1));
            System.out.println("c) " + alt.get(2));
            System.out.println("d) " + alt.get(3));
            System.out.println("e) " + alt.get(4));
            System.out.print("\nSelecione a alternativa que contém a ordem correta: ");
            opcao1 = entrada.next();

            switch (opcao1) {
                case "a":
                case "A":
                    if (opcaoCorreta.equals(alt.get(0))) {
                        acertou = true;
                    }
                    break;
                case "b":
                case "B":
                    if (opcaoCorreta.equals(alt.get(1))) {
                        acertou = true;
                    }
                    break;
                case "c":
                case "C":
                    if (opcaoCorreta.equals(alt.get(2))) {
                        acertou = true;
                    }
                    break;
                case "d":
                case "D":
                    if (opcaoCorreta.equals(alt.get(3))) {
                        acertou = true;
                    }
                    break;
                case "e":
                case "E":
                    if (opcaoCorreta.equals(alt.get(4))) {
                        acertou = true;
                    }
                    break;
            }
            if (acertou == true) {
                System.out.println("Resposta correta!");
            } else {
                System.out.println("Resposta errada!");
            }
            controle = controle + 1;
        } while (acertou == false);

        /*Se o jogador tem um bom desempenho na 1a pergunta, ele ganha um bagde*/
        if (controle <= 5) {
            System.out.println("\nGerente: ótimo, acho que você pode nos ajudar com essa tarefa!");
            System.out.println("\nMr.Robot: muito bom! " + nomeJogador + " olhe só o que esse desafio lhe rendeu! Um bagde trazido por Elton Mayo do passado!\n"
                    + "Vamos ver o que ele tem para dizer:");
            System.out.println("\nElton Mayo: a luta é indispensável para realizar as metas da alma, ou seja, lutar é saudável quando se constrói a felicidade.");
            System.out.println("\nMr. Robot: profundo! Já vejo em você uma áura de sabedoria, meu caro!\n"
                    + "Mas vamos voltar ao que interessa...");
        } else {
            System.out.println("\nGerente: é, deixa pra lá, vamos arrumar uma outra coisa para você fazer.");
        }
        System.out.println("\nGerente: já é quase hora do almoço, vá até o refeitório encontrar seus colegas.");
        System.out.println("\nMr. Robot: você se dirige até o refeitório e o que encontra é um grande salão com pessoas cabisbaixas.");
        System.out.println("\nMr. Robot: um rapaz se aproxima e estica a mão para cumprimentá-lo, ele é o analista mais antigo a equipe.");
        System.out.println("\nAnalista mais antigo (Marcelo): " + nomeJogador + ", precisamos da sua ajuda! Essa é Ana, nossa colega,\n"
                + "e aquele outro rapaz ali é outro estagiário, Marcos, acho que você não tinha sido apresentado ainda.");
        System.out.println("\nMr. Robot: seus colegas precisam de ajuda. Escute o que ele tem a dizer.");
        System.out.println("\nAnalista 2 (Ana): " + nomeJogador + ", precisamos que alguém retire um pen-drive do interior da sala da Virka.");

        /*O jogo pergunta o jogador quer ajudar. Se responde sim, o jogo segue. Se responde não, o jogador perde e o jogo fala da 
        importancia de se trabalhar em equipe. É uma tentativa de aliar o jogo aos ensinamentos práticos*/
        int opcao2, opcao3;
        do {
            System.out.println("\nAna: Você pode nos ajudar?");
            System.out.println("\nSelecione: 1 - Sim ou 2 - Não.");
            opcao2 = entrada.nextInt();
            if (opcao2 == 1) {
                break;
            } else {
                System.out.println("\nMr. Robot: você tem certeza que não quer oferecer sua ajuda, amigo? Ela é de grande importância para seus\n"
                        + "colegas. Além disso, saber trabalhar em grupo é uma grande virtude!");
                System.out.println();
                System.out.println("\nSelecione: 1 - Não quero ajudar ou 2 - Irei ajudar.");
                System.out.println();
            }
            opcao3 = entrada.nextInt();
            if (opcao3 == 1) {
                System.out.println("\nMr. Robot: sem a sua ajuda, seus companheiros não conseguiram acesso ao pen-drive\n"
                        + "e também não ficaram sabendo que o Gerente estava corrompido. Com isso, não foi possível impedir\n"
                        + "o próximo ataque de Virka. O trabalho em equipe é muito importante, lembre-se disso nas suas próximas escolhas.");
                System.out.println();
                System.out.println("***GAME-OVER!!!***");
                System.exit(0);
            }
        } while (opcao3 != 2);

        System.out.println("\nAna: Ótimo! o pen-drive está na 1a gaveta do escritório da Virka. Nenhum de nós conseguimos entrar lá\n"
                + "nosso rosto já é muito conhecido. Mas acreditamos que você, por ser novo, pode conseguir...");
        System.out.println("\nMarcelo: exatamente!");
        System.out.println("\nMr Robot: todos te olham com olhar apreensivo, em concordância com Marcelo e Ana.");
        System.out.println("\nMarcelo: tudo que você precisa fazer é entrar lá e pegar o pen-drive sem ser notado!");
        System.out.println("\nMr. Robot: você, então, se dirige até o elevador e inicia a caminhada até a sala da Virka. Ao chegar lá você\n"
                + "percebe que o seu gerente está conversando com a Virka. Tente ouvir a conversa deles, eles estão tramando alguma coisa...");
        System.out.println("\nGerente: Virka, os funcionários já estão desconfiados do meu envolvimento na morte do presidente...");
        System.out.println("\nVirka: deixem que desconfiem, nenhum deles tem força para disputar poder comigo.\n"
                + "Agora vá, e prepare tudo para o próximo ataque do nosso plano!");
        System.out.println("\nGerente: ok!");
        System.out.println("\nMr. Robot: você aproveita o momento em que o gerente saiu e Virka se auto-desligou para tentar resgatar o pen-drive.\n"
                + "Ao acessar a 1a gaveta, você consegue acesso ao pen-drive, mas um alarme dispara. Logo os robôs comandados por Virka chegarão\n"
                + "Você precisa responder a um desafio para sair dessa com o pen-drive! O lançamento de dados irá dizer quantas chances\n"
                + "você terá para acertar.");

        //2o desafio segue abaixo:        
        int i = 1, c = 0, soma2dados = dados();
        String opcao4, correta = "a";
        System.out.println("\nO número sorteado foi: " + soma2dados);
        System.out.println("\nMr. Robot: isso significa que você terá " + soma2dados + " chances para acertar a pergunta abaixo!");

        if (soma2dados >= 6) {
            System.out.println("\nMr. Robot: Percebo que você está com sorte!");
        } else {
            System.out.println("\nMr. Robot: Preste atenção, você não tem muitas chances!");
        }

        do {
            System.out.println("\nSão consideradas funções administrativas:\n"
                    + "a)Planejamento, Organização, Direção e Controle;\n" // ALTERNATIVA CORRETA
                    + "b)Planejamento, Organização, Contabilidade e Comércio Exterior;\n"
                    + "c)Organização, Contabilidade e Planejamento Tributário;\n"
                    + "d)Organização, Relações Internacionais e Planejamento Tributário.");

            opcao4 = entrada.next();

            switch (opcao4) {
                case "a":
                case "A":
                    System.out.println("Resposta Correta!");
                    break;
                case "b":
                case "B":
                case "c":
                case "C":
                case "d":
                case "D":
                    System.out.println("Resposta errada. Tente novamente!");
                    c = c + 1;
                    break;
            }
            i = i + 1;
        } while (i <= soma2dados && !opcao4.equalsIgnoreCase(correta));

        /*Se o jogador acertar a pergunta feita no desafio o jogo continua. Senão dá game-over*/
        if (!opcao4.equalsIgnoreCase(correta)) {
            System.out.println("\nMr. Robot: seus amigos correram em sua ajuda quando ouviram a sirene tocar!");
            System.out.println("\nMarcelo: ESSA NÃO! CORRE AGORA!");
            System.out.println("\nAna: Fuja, esquece o pen-drive!");
            System.out.println("\nMr. Robot: tarde demais, você foi certado por robôs comandados por Virka. Ela despertou e ordenou sua prisão!");
            System.out.println("\n ***GAME-OVER!!!***");
            System.exit(0);
        } else {
            System.out.println("\nMr. Robot: Excelente! Você acertou! Agora precisa entrar o pen-drive aos seus colegas!");
        }
        System.out.println("\nMr. Robot: O conteúdo do pen-drive é de grande ajuda!");
        System.out.println("\nMarcelo: Mandou bem, " + nomeJogador + "!");
        System.out.println("\nMarcos (o outros estagiário): vamos ver o que tem nele!");
        System.out.println("\nMr. Robot: todos se olham preocupados enquanto Ana espeta o pen-drive na porta USB!\n"
                + "No pen-drive constam informações de que o Gerente estava mesmo corrompido e tinha envolvimento na\n"
                + "operação maligna de Virka que resultou a morte do Presidente da empresa semanas atrás!\n"
                + "\nO Diretor se aproxima...");
        System.out.println("\nDiretor: bom trabalho a todos. Já fazia tempo que desconfiava que o Gerente estava corrompido, mas\n"
                + "infelizmente não poderei demiti-lo ainda, ele é protegido de Virka!");
        System.out.println("\nDiretor: " + nomeJogador + ", você provou sua lealdade a esta esquipe hoje. Irei promovê-lo a\n"
                + "analista, você mereceu!");
        System.out.println("\nMr. Robot: todos ficaram muito felizes com a sua conquista. Mas não se iluda, essa aventura apenas acabou de começar...");
        System.out.println("\n\n***FIM DA 1a FASE***");
        faseAnalista();
    }
    //método da 2a fase
    public static void faseAnalista() {
        System.out.println();
        System.out.println("\n**FASE 2: TEMPOS DIFÍCIEIS!**");
        System.out.println();
        System.out.println("\nMr. Robot: Parabéns " + nomeJogador + ", você conquistou um novo cargo em nossa empresa!");
        System.out.println("\nMr. Robot: Mas não se anime tanto, pois os desafios serão ainda mais difíceis...");

        System.out.println("\nMr. Robot: Bom, agora que descobrimos que o nosso gerente foi corrompido, precisamos descobrir"
                + " os pontos fracos no sistema de Virka, só assim conseguiremos mais informações.");

        System.out.println("\nMr. Robot: Antes de iniciarmos o desafio, me responda uma questão.");

        String opcao;
        boolean controle = false;
        ArrayList<String> resposta = new ArrayList<String>();
        resposta.add("O analista de sistemas é responsável por analisar e desenvolver sistemas, realizando modelagem de dados e " //resposta correta
                + "determinando os requisitos necessários para implementação dos programas estipulados, que variam conforme os objetivos ");
        resposta.add("O analista é a pessoa responsável pelo controle e planejamento de parte de uma organização. Muitas vezes os analistas "
                + "são responsáveis por setores de uma empresa, e em alguns casos estão no comando de toda a atividade desempenhada.");
        resposta.add("O analista dirige, planeja, organiza e controla as atividades de diversas áreas da empresa, fixando políticas de gestão"
                + " dos recursos financeiros, administrativos, estruturação, racionalização, e adequação dos serviços diversos.");

        do {
            Collections.shuffle(resposta);
            System.out.println("\nO QUE FAZ UM ANALISTA?");
            System.out.println("(A) " + resposta.get(0));
            System.out.println("(B) " + resposta.get(1));
            System.out.println("(C) " + resposta.get(2));
            System.out.println("Indique a alternativa correta: ");
            opcao = entrada.next();

            opcao = opcao.toUpperCase();

            switch (opcao) {
                case "A":
                    if (resposta.get(0).equals("O analista de sistemas é responsável por analisar e desenvolver sistemas, realizando modelagem de dados e "
                            + "determinando os requisitos necessários para implementação dos programas estipulados, que variam conforme os objetivos ")) {

                        System.out.println("\nMr. Robot: Muito bem, você está pronto para a próxima fase, vamos nessa!");
                        controle = true;
                    } else {
                        System.out.println("\nMr. Robot: Não é bem isso... Vamos tentar mais uma vez " + nomeJogador + "?!");
                    }
                    break;
                case "B":
                    if (resposta.get(1).equals("O analista de sistemas é responsável por analisar e desenvolver sistemas, realizando modelagem de dados e "
                            + "determinando os requisitos necessários para implementação dos programas estipulados, que variam conforme os objetivos ")) {

                        System.out.println("\nMr. Robot: Muito bem, você está pronto para a próxima fase, vamos nessa!");
                        controle = true;

                    } else {
                        System.out.println("\nMr. Robot: Não é bem isso... Vamos tentar mais uma vez " + nomeJogador + "?!");
                    }
                    break;
                case "C":
                    if (resposta.get(2).equals("O analista de sistemas é responsável por analisar e desenvolver sistemas, realizando modelagem de dados e "
                            + "determinando os requisitos necessários para implementação dos programas estipulados, que variam conforme os objetivos ")) {

                        System.out.println("\nMr. Robot: Muito bem, você está pronto para a próxima fase, vamos nessa!");
                        controle = true;
                    } else {
                        System.out.println("\nMr. Robot: Não é bem isso... Vamos tentar mais uma vez " + nomeJogador + "?!");
                    }
                    break;
                default:
                    System.out.println("Resposta Inválida");
            }
        } while (!controle);

        System.out.println("\nMr. Robot: Durante uma conversa, Marcelo e Ana (os analistas) descobriram "
                + "que existem grandes falhas no banco de dados da Virka\t" + "Essa é uma ótima oportunidade para destruí-la...");

        int opcao1, opcao2 = 0;
        do {
            System.out.println("\nMr. Robot: Mas para isso eles precisam de sua ajuda, você topa mais um desafio?");
            System.out.println("\n1 - SIM ou 2 - NÃO");
            opcao1 = entrada.nextInt();
        } while (opcao1 != 1 && opcao1 != 2);

        if (opcao1 == 1) {
            System.out.println("\nMr.Robot: EXCELENTE!!");
        } else {
            do {
                System.out.println("\nMr.Robot: Você tem certeza que desistirá do desafio? Sua ajuda é extremamente importante para nós...");
                System.out.println("\n1 - SIM ou 2 - NÃO");
                opcao2 = entrada.nextInt();
            } while (opcao2 != 1 && opcao2 != 2);
        }

        if (opcao2 == 1) {
            System.out.println("\nMr. Robot: Que pena " + nomeJogador + ", infelizmente não podemos seguir sem a sua ajuda.\n"
                    + " Você não instalou o software de espionagem e não conseguimos descobrir a tempo os planos horríveis de Virka.");
            System.out.println("\nMr. Robot: A guerra nuclear está mais próxima do que imaginei...\n");
            System.out.println("\n\n***GAME-OVER!!!***");
            System.exit(0);
        }
        System.out.println("\nMarcelo: Que bom que podemos contar com sua ajuda! Agora vamos direto ao ponto.");
        System.out.println("\nAna: Você precisa intalar um software de espionagem no banco de dados da Virka.\n"
                + "todas as informações serão transferidas para mim e Marcelo");
        System.out.println("\nMr.Robot: Aproveite que ela está em uma reunião, se apresse e tome cuidado...");
        System.out.println("\nMr. Robot: Você se aproxima da sala de Virka com cautela para que ninguem perceba a sua presença.\n"
                + "Realiza o Download do software de espionagem e aguarda o final da instalação...\n\nOs minutos estão passando, Virka pode retornar a qualquer momento...");
        System.out.println("\nMr. Robot: SE APRESSE, ELA ESTA VINDO!!!");
        System.out.println("\nMr. Robot: " + nomeJogador + ", para que o desafio seja concluído e a instalação seja finalizada,\n"
                + "responda essa questão. Você terá apenas 3 chances! Fique atento...");

        ArrayList<String> resposta1 = new ArrayList<String>();
        String opcaoCorreta = "Objetivo, concentração, proteção do tempo, controle", opcao3;
        resposta1.add("Organização, planejamento, descanso, autoridade");
        resposta1.add("Objetivo, concentração, proteção do tempo, controle"); //RESPOSTA CORRETA 
        resposta1.add("Atenção, postura, organização, planejamento");
        int valor = 1;
        boolean acertou = false;
        do {
            Collections.shuffle(resposta1);
            System.out.println("\n***QUAIS SÃO OS PRINCÍPIOS BÁSICOS DA GESTÃO DO TEMPO***");
            System.out.println("a) " + resposta1.get(0));
            System.out.println("b) " + resposta1.get(1));
            System.out.println("c) " + resposta1.get(2));
            System.out.print("Indique a resposta correta: ");
            opcao3 = entrada.next();
            opcao3 = opcao3.toUpperCase(); //Converte o valor de "opção3" para letra maiúscula

            switch (opcao3) {
                case "A":
                    if (opcaoCorreta.equals(resposta1.get(0))) {
                        acertou = true;
                    }
                    break;
                case "B":
                    if (opcaoCorreta.equals(resposta1.get(1))) {
                        acertou = true;
                    }
                    break;
                case "C":
                    if (opcaoCorreta.equals(resposta1.get(2))) {
                        acertou = true;
                    }
                    break;
            }
            if (acertou == true) {
                System.out.println("Resposta correta!");
                System.out.println();
            } else {
                System.out.println("Resposta errada!");
                System.out.println();
            }
            valor++;
        } while (valor <= 3 && acertou == false);

        if (acertou == true) {
            System.out.println("\nContinua o jogo....");
        } else {
            System.out.println("\nMr.Robot: Você não conseguiu finalizar a instalação, Virka chegou e descobriu todos os planos de destruição.");
            System.out.println("\nMr.Robot: Seremos ejetados para fora da nave, esse é o nosso fim!!\n");
            System.out.println("***GAME-OVER***");
            System.exit(0);
        }
        System.out.println("\nMr.Robot: Muito bem " + nomeJogador + " você me surpreende a cada desafio");
        System.out.println("\nMr.Robot: Graças a você, o software de espionagem foi instalado antes da Virka chegar...");
        System.out.println("\nMr.Robot: Agora vá, precisa avisar o Marcelo e a Ana.\n");
        System.out.println("\n***JÁ NA SALA DOS ANALISTAS***");
        System.out.println("\nMr.Robot: Ana e Marcelo, conseguimos, o software foi instalado!!");
        System.out.println("\nMr.Robot: Depressa, vamos ver quais são os próximos planos de Virka....");
        System.out.println("\n***O silêncio toma conta durante alguns minutos, um olha para o outro \n"
                + "sem acreditar no havia acabado de ser descoberto, a Virka...***");
        System.out.println("\nMarcelo: ela precisa sair do comando, precisamos derrotá-lá!");
        System.out.println("\nAna: ela está planejando uma chantagem internacional para controlar o continente...");
        System.out.println("\nMr. Robot: vocês se dão conta de que precisam fazer alguma coisa!");
        System.out.println("\"UIUIUIUIUI[..]\"");
        System.out.println("\nMr.Robot: Alarme de incêndio? VAMOS, CORRAM!!");
        System.out.println("\n**ALGUNS MINUTOS DEPOIS EM OUTRO PONTO DA EMPRESA**");
        System.out.println("\nDiretor: parabéns, meus caros, essas informações que vocês conseguiram é um avanço importantíssimo!");
        System.out.println("\nDiretor: " + nomeJogador + ", você está promovido à gerência em virtude do bom serviço prestado!");
        System.out.println("\n\n***FIM DA 2a FASE***");
        faseGerente();

    }

    //método da 3a fase
    public static void faseGerente() {
        System.out.println();
        System.out.println("\n**FASE 3: PEQUENAS VITÓRIAS**");
        System.out.println();
        String alternativa, correta = "b";
        int opcao, opcao2;

        System.out.println("\nMr. Robot: Ei " + nomeJogador + ", Virka percebeu seus movimentos e designou um robô para tentar nos impedir de tirá-la \n"
                + "do comando."
                + "Fique atento!");
        System.out.println("\nMarcelo: Nós derrotamos ela outras vezes, precisamos de sua ajuda novamente, " + nomeJogador + ".");
        System.out.println("\nMr. Robot: O robô designado por Virka virá daqui a pouco "
                + "fazer uma entrevista com vocês... \nAjam naturalmente e trabalhem em equipe para derrotá-lo!!!");
        System.out.println("\nAna: Talvez pudessemos levar esse tal robô para uma área isolada"
                + "e desativá-lo de alguma forma.");

        do {
            System.out.println("\nMarcelo: Você acha que temos chance " + nomeJogador + " ?");
            System.out.println("\nSelecione: 1 - Sim ou 2 - Não.");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                break;
            } else if (opcao == 2) {
                System.out.println("\nMr. Robot: Pense bem, precisamos de você para vencer Virka!");
                System.out.println();
                System.out.println("\nSelecione: 1 - Não quero ajudar ou 2 - Irei ajudar.");
                System.out.println();
            } else {
                System.out.println("Opção inválida!");
            }
            opcao2 = entrada.nextInt();
            if (opcao2 == 1) {
                System.out.println("\nMr. Robot: Sem sua ajuda, sua equipe foi descoberta pelo robô de Virka. Assim como seu período de "
                        + "estágiario o trabalho em equipe é fundamental. \n\nConfie na sua equipe!");
                System.out.println();
                System.out.println("\n\n***GAME-OVER!!!***");
                System.exit(0);
            } else if (opcao2 == 2) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao2 != 2);

        System.out.println("\nToda a equipe se anima...");
        System.out.println("\nMr. Robot: em poucos instantes chegará o robô para a entrevista, responda com calma, esse robô não é tão desenvolvido\n"
                + "quanto Virka");
        System.out.println("\nAna: Vai dar tudo certo pessoal!");
        System.out.println("\nMarcelo: após a entrevista pensaremos em um bom plano. Apenas lembrem-se: não sabemos de nada sobre a morte do presidente!");
        System.out.println("\nRobô enviado por Virka: Olá, farei uma entrevista apenas para ter um parâmetro da opnião de vocês com relação ao gerenciamento\n"
                + "da empresa. ");
        System.out.println("\nRobô enviado por Virka: Preciso falar com cada um de vocês separadamente para ter um controle melhor, vamos começar com você, ok?");
        System.out.println("\n***E o robô aponta para Marcelo.(O mais antigo da empresa que ali estava)***");
        System.out.println("\nAlguns minutos depois...");
        System.out.println("\nMr. Robot: Chegou sua vez, " + nomeJogador + ".");
        do {

            System.out.println("\nRobô enviado por Virka: O que você acha do presidente da empresa?:\n"
                    + "a) Não o conheço.\n"
                    + "b) Ele sempre fez um excelente trabalho.\n" //ALTERNATIVA CORRETA
                    + "c) Prefiro Virka no comando.\n"
                    + "d) Ué, ele não está morto?!");

            alternativa = entrada.next();
            switch (alternativa) {
                case "b":
                case "B":
                    System.out.println("\nRobô enviado por Virka: Sem dúvidas!");
                    break;
                case "a":
                case "A":
                case "c":
                case "C":
                case "d":
                case "D":
                    System.out.println("Mr. Robot: ESSA NÃO!! Com essa resposta o robô enviado por Virka percebeu que você sabe sobre o presidente \n"
                            + "e irá reportá-lo para Virka");
                    System.out.println();
                    System.out.println("***GAME-OVER***");
                    System.exit(0);
            }
        } while (!alternativa.equalsIgnoreCase(correta));
        System.out.println("\nRobô enviado por Virka: obrigado pessoal, agora podem voltar aos seus afazeres.");
        System.out.println("\nAlguns intantes após a saída do robô...");
        System.out.println("\nMarcelo: Pessoal, algum plano para pararmos esse robô?");
        System.out.println("\nAna: E se hackeassemos ele? Conseguiriamos desligá-lo e talvez obter alguma informação referente à Virka.");
        System.out.println("\nMr. Robot: Alguém aqui tem esse conhecimento?");
        System.out.println("\nMarcelo: Ei, Marcos, já conversamos sobre esse assunto antes. O que você precisa pra isso?");
        System.out.println("\nMarcos: Euuu?!");
        System.out.println("\nAna: Claro, você consegue!");
        System.out.println("\nMarcos: Bem, preciso que vocês enrolem o robô por 5 minutos! Assim consigo hackea-lo. ");
        System.out.println("\nMarcelo: Eu consigo chamá-lo e, em seguida, vocês executam o plano!");
        System.out.println("\nMarcos: Ei, " + nomeJogador + ", você vem comigo.");
        System.out.println("\nMr. Robot: enquanto a equipe aguarda Marcelo atrair o Robô de Virka...");
        System.out.println("\nMarcos: Ficaremos na sala ao lado, preciso que você responda a questão que aparecerá no programa!\n"
                + "Estou muito nervoso para responder. Deixe o resto dos códigos comigo! Vou conseguir!!");
        System.out.println("\nMr. Robot: algum tempo depois Marcelo consegue atrair o Robô (Virka).");
        System.out.println("\nMarcos: Sem querer colocar pressão em você mas caso erre a questão o Robô (Virka) vai conseguir bloquear meu \n"
                + "acesso e irá reportar a Virka. Por isso preste atenção, vou começar.");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println(".......");
        System.out.println("\nMarcos: Sua vez, " + nomeJogador + "!");

        int tentativas = 0;
        String alt, certa = "d";

        System.out.println("***PROGRAMA DE MARCOS***");
        do {
            System.out.println("\nAs  metas  são  objetivos  intermediários  que  precisam  ser  alcança dos  e  que  darão suporte: \n"
                    + "a) Às funções.\n"
                    + "b) Ao controle.\n"
                    + "c) Aos objetivos.\n"
                    + "d) Ao planejamento."); //ALTERNATIVA CORRETA
            alt = entrada.next();
            switch (alt) {
                case "D":
                case "d":
                    System.out.println("Resposta correta!");
                    System.out.println("Acesso aos códigos permitido.");
                    break;
                case "a":
                case "A":
                case "b":
                case "B":
                case "c":
                case "C":
                    System.out.println("Pense bem, você tem mais 1 chance!");
                    tentativas++;
            }
        } while (tentativas <= 1 && !alt.equalsIgnoreCase(certa));
        if (tentativas == 2 && !alt.equalsIgnoreCase(correta)) {
            System.out.println("Resposta errada!");
            System.out.println("Acesso negado!");
            System.out.println(" ");
            System.out.println("O Robô notou que estava sendo invadido e reportou a Virka...");
            System.out.println("***GAME-OVER***");
            System.exit(0);
        }
        System.out.println("\nMarcos: Boooa " + nomeJogador + ", agora consigo desligá-lo.");
        System.out.println("\n\n***Enquanto isso na sala onde estão todos...***");
        System.out.println("\n\nMarcelo: Ei roboôzinho, eu gostaria de reportar que o ar condicionado desse setor está péssimo!");
        System.out.println("\nRobô enviado por Virka: Irei reportar ao presidente ele deve mandar alguém para arruuu. . .");
        System.out.println("\nAna: O que houve? Será que o Marcos conseguiu?");
        System.out.println("\nMarcelo Ele apagou, rápido  vamos escondê-lo no quartinho dos materiais de limpeza!");
        System.out.println("\nVocê e Marcos saem da sala logo em seguida.");
        System.out.println("\nMr. Robot: Excelente, pessoal!!");
        System.out.println("\n\n***Já no quartinho dos materiais de limpeza...***");
        System.out.println("\n\nAna: Marcos, conseguiu alguma informação confidencial? ");
        System.out.println("\nMarcos: O sistema dele tinha muitas coisas criptografadas, um sistema muito dificil!"
                + "\nAntes de desligá-lo, descobri que Virka pretente automatizar toda a empresa!");
        System.out.println("\nMarcelo: se ela conseguir nós vamos todos perder o emprego e não restará ninguém para impedi-la no plano de\n"
                + "chantagem internacional para dominar o continente...");
        System.out.println("\nEu não teria conseguido sem a ajuda do(a) " + nomeJogador + ".");
        System.out.println("\nMr. Robot: Excelente trabalho, pessoal! ");
        System.out.println("\nTodos comemoram muito felizes por mais uma vitória...*");
        System.out.println("\n**Parábens! Você foi promovido a Diretor!**");
        System.out.println("\n\n***FIM DA 3a FASE***");
        faseDiretor();
    }

    //método da 4a e última fase
    public static void faseDiretor() {

        System.out.println();
        System.out.println("***ÚLTIMA FASE: A BATALHA FINAL***");
        System.out.println();

        //Pequeno do-while para dar uma segurada no texto e não acumular muita coisa pro jogador ler.
        int escolha;
        do {
            System.out.println("\nContinuar?");
            System.out.println("\n1 - Sim, 2 - Não");
            escolha = entrada.nextInt();
        } while (escolha != 1);

        System.out.println("\nMr. Robot: há muitos dias vocês estão preocupados, apesar de algumas pequenas vitórias recentes, muito pouco conseguiram\n"
                + "avançar na empreitada de derrotar Virka! Você é o novo diretor e precisa liderar a equipe, os ânimos não estão dos melhores!");
        System.out.println("\nAna: precisamos de um plano! Alguém tem alguma ideia?");
        System.out.println("\nMarcelo: Diretor(a) " + nomeJogador + ", estive pensando....\n\nAcho que precisamos de ajuda do pessoal do passado, os pensadores"
                + "são a nossa única esperança!");
        System.out.println("\nMr. Robot: todos concordam com Marcelo... E você?");

        do {
            System.out.println("\nConcordar?");
            System.out.println("\n1 - Sim, 2 - Não");
            escolha = entrada.nextInt();
            if (escolha == 2) {
                System.out.println("\nMarcelo: mas " + nomeJogador + " o que mais podemos fazer?");
                System.out.println("\nMr. Robot: todos te olham com certa esperança, mas você conclui que, de fato, não há muito a fazer, por isso\n"
                        + "acaba concordando com o plano dos seus subordinados...");
                System.out.println("\nMr. Robot: fique com esse ensinamento: um bom líder é aquele que sabe ouvir! Você está de parabéns!\n"
                        + "não basta ser chefe, é preciso saber ser líder!");
                System.out.println("\nMr. Robot: e cá entre nós, meu caro amigo, o plano de Marcelo é bem interessante, vamos ouvir...");
            } else if (escolha == 1) {
                System.out.println("\nMr. Robot: excelente escolha, amigo, vamos ouvir o que Marcelo tem a dizer...");
            } else {
                System.out.println("\nOpção inválida!");
            }
        } while (escolha != 1 && escolha != 2);

        System.out.println("\nMarcelo: então, na sala dos pensadores está guardada a chave mestra, certo?");
        System.out.println("\nMarcos (o estagiário): mas o que ela tem a ver com isso?");
        System.out.println("\nMarcelo: a chave mestra é o único instrumento existente que pode resetar Virka. Precisamos entrar lá, pegar a chave\n"
                + "e então dar um jeito de entrar na sala da Virka para fazer o reset....");
        System.out.println("\nAna: é uma boa ideia, mas vamos ter que contar com a sorte...");
        System.out.println("\nMr. Robot: para entrar na sala dos pensadores é preciso confundir o droid que faz a guarda"
                + "da entrada. \nO único jeito de fazer isso, é por meio de um jogo de azar...");
        System.out.println("\nMr. Robot: mas vejo que você interessou...");
        System.out.println("\nTodos: ENTÃO VAMOS!");
        System.out.println("\nMr. Robot: vocês se dirigem até a sala dos pensadores sem fazer muito barulho, os ouvidos da Virka estão cada vez \n"
                + "mais sensíveis...");
        System.out.println("\nAna: " + nomeJogador + ", confunda o guarda que nós entraremos sem sermos vistos!");
        System.out.println("\nMr. Robot: você se aproxima do droid e ele logo propõe...");
        System.out.println("\nDroid Guardião: olá, vamos jogar? Vou pensar em um número de 1 a 100, se você advinhar o número que estou pensando\n"
                + "deixarei você entrar!");
        System.out.println("\nDroid Guardião: hummmm, deixe-me ver, já sei! Tente advinhar, a quantidade de chances que você terá vai depender dos dados!");

        int dado = dados(), chance, c = 1, numero;
        Random aleatorio = new Random();
        numero = (aleatorio.nextInt(100) + 1);
        System.out.println("\nMr. Robot: Qual número o Droid Guardião pensou? Você terá " + dado + " chances para acertar!");

        do {
            System.out.print("\n" + c + "a tentativa: ");
            chance = entrada.nextInt();
            if (chance == (numero + 1) || chance == (numero - 1)) {
                System.out.println("TÁ QUENTE!");
                System.out.println();
            } else if (chance > numero) {
                System.out.println("O número que você digitou é MAIOR que o número escolhido!");
                System.out.println();
            } else if (chance < numero) {
                System.out.println("O número que você digitou é MENOR que o número escolhido!");
                System.out.println();
            } else if (chance == numero) {
                System.out.println("Parabéns! você ganhou o jogo!");
                break;
            }
            c++;
        } while (c <= dado);

        /*Se o jogador advinha o número sorteado o desenrolar da história se dá de uma forma (if).
        Se o jogador não advinha o desenrolar se dá de outra forma um pouco diferente (else), mas sem grandes mudanças*/
        if (chance != numero) {
            System.out.println("\nMr Robot: ESSA NÃO!! O número pensado pelo Droid era: " + numero + "! Vocês vão ter que ser rápidos.");
            System.out.println("\n***ALARME DISPARA***");
            System.out.println("\nMr. Robot: O droid guardião disparou o alarme, logo vocês estão cercados...");
            System.out.println("\nAna: Marcelo, quebre o vidro da porta, vamos ter que entrar à força!");
            System.out.println("\nMr. Robot: Marcelo pega o extintor de incêncio fixado na parede ao lado e golpeia a porta de vidro. A porta\n"
                    + "se quebra e vocês entram. Após alguns momentos de procura vocês encontram a chave escondida em um fundo falso no armário.\n"
                    + "Vocês agora estão cercados e a ajuda chega do passado...");
            System.out.println("\n***FREDERICK TAYLOR ENTRA PELA PORTA***");
            System.out.println("\nFriederick Taylor: olá meus caros, acho melhor vocês correrem, deixem que eu distraio os droids...");
            System.out.println("\nAna: ótimo, obrigada, vamos, gente, direto para a sala da Virka!");

        } else {
            System.out.println("\nMr Robot: YAAAAYYYYY!!!! O número pensado pelo Droid era: " + numero + " mesmo!!");
            System.out.println("\nDroid Guardião: olá, quem sou eu???");
            System.out.println("\nMarcelo: CORRAMMM! Aproveitem enquanto ele está confuso!");
            System.out.println("\nMr. Robot: todos começam a vasculhar a sala à procura da chave mestra! Quando Frederick Taylor entra pela porta,\n"
                    + "vindo do passado, ele tem um ensinamento....");
            System.out.println("\nTaylor: meu caros, a ideia de tarefa é, quiçá, o mais importante elemento na administração científica, por isso,\n"
                    + "fico muito satisfeito que todos vocês estão seguindo meus ensinamentos e trabalhando em equipe. Irei conceder-lhes o meu bagde\n"
                    + "A maior honraria que posso conceder a alguem....");
            System.out.println("\nTaylor: a propósito, a chave mestra está em um fundo falso atrás de você...");
            System.out.println("\n***APONTANDO PARA MARCOS***");
            System.out.println("\nMarcos: pera aí, gente...");
            System.out.println("\nMr. Robot: Marcos desliza a mão por um pedaço do armário e um cofre se abre, a chave mestra brilha lá dentro...");
            System.out.println("\nMarcelo: vamos, peguem a chave e corram, vamos direto para sala da Virka!");
        }

        //do-while para segurar o texto
        int escolha2;
        do {
            System.out.println("\nContinuar?");
            System.out.println("\n1 - Sim, 2 - Não");
            escolha2 = entrada.nextInt();
        } while (escolha2 != 1);

        System.out.println("\nMr. Robot: vocês chegam na sala da Virka, mas não vai ser tão simples entrar lá...");
        System.out.println("\nMarcelo: bem amigos, é isso, estamos diante do desafio final!");
        System.out.println("\nAna: se conseguirmos acertar entramos e derrotamos Virka, caso contrário, tudo está perdido.");
        System.out.println("\nMr. Robot: ATENÇÃO! Serão escolhidos alguns números aleatórios, tente advinhar um dos números\n"
                + "sorteado! Se você acertar apenas um deles, sua vida será MUITO mais fácil!");

        /*COMENTÁRIOS AO DESAFIO ABAIXO: A ideia desse desafio foi (ver referências ao longo do código):
         1)Pedir ao jogador que digitasse um número aleatório de 1 a 100; 
         2)Preencher uma matriz com números aleatórios de 1 a 100;
         3)Comparar se o número escolhido pelo jogador está presente na matriz;
         4)Se o número que o jogador escolheu também for sorteado pelo computador aleatoriamente, então o desafio apresenta apenas uma pergunta, 
        caso contrário, o desafio apresenta duas perguntas;
         5) Por fim, também foi lançada a função dados (definida no início do código) para estabelecer o número de tentativas que o jogador 
        terá para acertar o desafio*/
        int esc;
        do {
            System.out.print("\nMr. Robot: Escolha um número de 1 a 100: ");  //item 1 do comentário acima;
            esc = entrada.nextInt();
            if (esc < 1 || esc > 100) {
                System.out.println("\nNúmero inválido!!!");
            }
        } while (esc < 1 || esc > 100);

        boolean acertouMatriz = false;
        int d = dados();                        //item 5 dos comentário acima - chamando a função do lançamento de dados;
        Random aleatorioGerente = new Random();
        int matriz[][] = new int[6][6];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = aleatorioGerente.nextInt(100) + 1;  //item 2 do comentário acima;                           
                if (esc == matriz[i][j]) {                         //item 3 do comentário acima;
                    acertouMatriz = true;
                    break;
                }
            }
        }
        if (acertouMatriz == true) {  //item 4 do comentário acima.
            //Se o número digitado pelo jogador for sorteado na matriz, o código entra aqui.
            //nessa hipótese o jogador terá que responder apenas a uma pergunta.
            System.out.println("\nMr. Robot: ACERTOU! O valor que você escolheu foi aleatóriamente armazenado "
                    + "pela matriz! Você terá que responder apenas uma pergunta!");
            System.out.println("\nMr. Robot: prepare-se, você terá: " + d + " tentativas!"); //item 5 dos comentário acima;

            String opcaoCorreta = "Hierarquia, Unidade de Comando, Divisão do Trabalho", opcao1;
            ArrayList<String> alternativas = new ArrayList<>();
            boolean acertou1 = false;
            int tentativa = 1;
            alternativas.add("Hierarquia, Controle e Paternalismo na administração");
            alternativas.add("Unidade de Direção e Subordinação dos Interesses Gerais aos Individuais");
            alternativas.add("Hierarquia, Unidade de Comando, Divisão do Trabalho"); //resposta correta
            alternativas.add("Remuneração justa e Subordinação");

            do {
                Collections.shuffle(alternativas);
                Collections.shuffle(alternativas);
                System.out.println("\nSão princípios da administração clássica propostos por Henry Fayol:\n");
                System.out.println("a) " + alternativas.get(0));
                System.out.println("b) " + alternativas.get(1));
                System.out.println("c) " + alternativas.get(2));
                System.out.println("d) " + alternativas.get(3));
                System.out.print("\nSelecione a alternativa correta: ");
                opcao1 = entrada.next();

                switch (opcao1) {
                    case "a":
                    case "A":
                        if (opcaoCorreta.equals(alternativas.get(0))) {
                            acertou1 = true;
                        }
                        break;
                    case "b":
                    case "B":
                        if (opcaoCorreta.equals(alternativas.get(1))) {
                            acertou1 = true;
                        }
                        break;
                    case "c":
                    case "C":
                        if (opcaoCorreta.equals(alternativas.get(2))) {
                            acertou1 = true;
                        }
                        break;
                    case "d":
                    case "D":
                        if (opcaoCorreta.equals(alternativas.get(3))) {
                            acertou1 = true;
                        }
                        break;
                }
                if (acertou1 == true) {
                    System.out.println("Resposta correta!");
                    System.out.println();
                } else {
                    System.out.println("Resposta errada!");
                    System.out.println();
                }
                tentativa = tentativa + 1;
            } while (acertou1 == false && tentativa <= d);

            //RESPONDIDA A PERGUNTA PELO JOGADOR, O JOGO CONTINUA AQUI...
            if (acertou1 == true) {
                System.out.println("\n\nContinuar o jogo?");
                /*Se o jogador acerta o jogo continua lá embaixo, fora desse if-else;
                Se o jogador erra, entra nesse else e o jogador perde o jogo*/
            } else {
                System.out.println("\nMr. Robot: ESSA NÃO!!!");
                System.out.println("\n***O PAINEL DE LED ACENDE ISSO SIGNIFICA QUE VOCÊS ACORDARAM A VIRKA***");
                System.out.println("\nMr. Robot: a porta da antessala se tranca.");
                System.out.println("\nVirka: onde vocês pensam que vão? Ah, como são ingênuos...");
                System.out.println("\nMarcelo: deixe-nos sair!");
                System.out.println("\nVirka: vocês sabem bem o que eu fiz com a última pessoa que tentou me derrotar não é mesmo?! Vocês estão trancados aqui\n"
                        + " não tem mais para onde fugir.");
                System.out.println("\nMr. Robot: vocês começam a socar a porta e gritar por socorro!");
                System.out.println("\nVirka: não adianta pedir socorro, ele não virá! Vocês estão sob o meu comando e os mandarei para prisão perpétua.\n"
                        + "Nunca mais vocês entrarão no meu caminho. DROIDS LEVEM-OS...");
                System.out.println("\nMr. Robot: um grupo de aproximadamente 20 droid aparecem...");
                System.out.println("\nMr. Robot: vocês foram pegos e não tem mais nada que possam fazer. É o fim....");
                System.out.println("\n\n***GAME-OVER***");
                System.exit(0);
            }

        } else if (acertouMatriz == false) {  //item 4 do comentário acima.
            //Se o número digitado pelo jogador não for sorteado na matriz, o código entra aqui.
            //Nesse caso, o jogador terá que responder duas perguntas.
            System.out.println("\nMr. Robot: é, vejo que você não está com sorte hoje, meu caro! Você terá que responder"
                    + " duas perguntas");
            System.out.println("\nMr. Robot: prepare-se, você terá: " + d + " tentativas!"); //item 5 dos comentário acima;
            //respostas corretas
            String opcaoCorreta = "Hierarquia, Unidade de Comando, Divisão do Trabalho", opcao1, opcao2;
            String opcaoCorreta1 = "O clima organizacional pode ser avaliado por meio de muitos fatores dependendo do interesse da\n "
                    + "empresa, tais como comunicação, remuneração, carreira, liderança, relacionamento, satisfação, \n"
                    + "entre outros";
            ArrayList<String> alternativas = new ArrayList<>();
            ArrayList<String> alter = new ArrayList<>();
            boolean acertou3 = false, acertou2 = false;
            int tentativa2 = 1;

            //ALTERNATIVAS DA 1A PERGUNTA - 1o laço dentro do do-while principal (ver abaixo)
            alter.add("Clima e cultura organizacional são sinônimos");
            alter.add("Clima organizacional não influencia o comportamento das pessoas");
            alter.add("Clima organizacional pode não satisfazer às necessidades pessoais, elevando, consequentemente o\n"
                    + "moral, e de outro pode ser favorável e causar frustrações às pessoas pela satisfação de suas\n"
                    + "necessidades");
            alter.add("O clima organizacional pode ser avaliado por meio de muitos fatores dependendo do interesse da\n "
                    + "empresa, tais como comunicação, remuneração, carreira, liderança, relacionamento, satisfação, \n"
                    + "entre outros"); //resposta correta
            alter.add("Treinamento, desenvolvimento, benefícios e imagem da empresa não fatores de avaliação do clima organizacional.");

            //ALTERNATIVAS DA 2A PERGUNTA - 2o laço dentro do do-while principal (ver abaixo)
            alternativas.add("Hierarquia, Controle e Paternalismo na administração");
            alternativas.add("Unidade de Direção e Subordinação dos Interesses Gerais aos Individuais");
            alternativas.add("Hierarquia, Unidade de Comando, Divisão do Trabalho");  //resposta correta
            alternativas.add("Remuneração justa e Subordinação");

            do {
                do {
                    Collections.shuffle(alter);
                    Collections.shuffle(alter);
                    System.out.println("\n(FAU - 2017 - E-Paraná Comunicação - PR - Analista de Recursos Humanos)");
                    System.out.println("Referindo-se ao CLIMA ORGANIZACIONAL, é INCORRETO afirmar EXCETO:");
                    System.out.println("a) " + alter.get(0));
                    System.out.println("b) " + alter.get(1));
                    System.out.println("c) " + alter.get(2));
                    System.out.println("d) " + alter.get(3));
                    System.out.println("e) " + alter.get(4));
                    System.out.print("\nSelecione a alternativa correta: ");
                    opcao2 = entrada.next();

                    switch (opcao2) {
                        case "a":
                        case "A":
                            if (opcaoCorreta1.equals(alter.get(0))) {
                                acertou2 = true;
                            }
                            break;
                        case "b":
                        case "B":
                            if (opcaoCorreta1.equals(alter.get(1))) {
                                acertou2 = true;
                            }
                            break;
                        case "c":
                        case "C":
                            if (opcaoCorreta1.equals(alter.get(2))) {
                                acertou2 = true;
                            }
                            break;
                        case "d":
                        case "D":
                            if (opcaoCorreta1.equals(alter.get(3))) {
                                acertou2 = true;
                            }
                            break;
                        case "e":
                        case "E":
                            if (opcaoCorreta1.equals(alter.get(4))) {
                                acertou2 = true;
                            }
                            break;
                    }
                    if (acertou2 == true) {
                        System.out.println("Resposta correta!");
                        System.out.println();
                    } else {
                        System.out.println("Resposta errada!");
                        System.out.println();
                    }
                    tentativa2 = tentativa2 + 1;
                } while (acertou2 == false && tentativa2 <= d);

                //Se o jogador esgota todas as tentativas na 1a pergunta o jogo nem entre nesse laço while aqui embaixo.
                while (acertou3 == false && tentativa2 <= d) {
                    Collections.shuffle(alternativas);
                    Collections.shuffle(alternativas);
                    System.out.println("\nSão princípios da administração clássica propostos por Henry Fayol:\n");
                    System.out.println("a) " + alternativas.get(0));
                    System.out.println("b) " + alternativas.get(1));
                    System.out.println("c) " + alternativas.get(2));
                    System.out.println("d) " + alternativas.get(3));
                    System.out.print("\nSelecione a alternativa correta: ");
                    opcao1 = entrada.next();

                    switch (opcao1) {
                        case "a":
                        case "A":
                            if (opcaoCorreta.equals(alternativas.get(0))) {
                                acertou3 = true;
                            }
                            break;
                        case "b":
                        case "B":
                            if (opcaoCorreta.equals(alternativas.get(1))) {
                                acertou3 = true;
                            }
                            break;
                        case "c":
                        case "C":
                            if (opcaoCorreta.equals(alternativas.get(2))) {
                                acertou3 = true;
                            }
                            break;
                        case "d":
                        case "D":
                            if (opcaoCorreta.equals(alternativas.get(3))) {
                                acertou3 = true;
                            }
                            break;
                    }
                    if (acertou3 == true) {
                        System.out.println("Resposta correta!");
                        System.out.println();
                    } else {
                        System.out.println("Resposta errada!");
                        System.out.println();
                    }
                    tentativa2 = tentativa2 + 1;
                }
                tentativa2 = tentativa2 + 1;
            } while (acertou3 == false && acertou2 == false && tentativa2 <= d);

            //RESPONDIDA AS DUAS PERGUNTAS PELO JOGADOR, O JOGO CONTINUA AQUI...
            if (acertou3 == true && acertou2 == true) {
                System.out.println("\n\nContinuar o jogo?");
                //Se o jogador acerta as duas perguntas o jogo continua hora desse if-else.
                //Se o jogador erra, entra nesse else e ele perde o jogo.
            } else {
                System.out.println("\nMr. Robot: ESSA NÃO!!!");
                System.out.println("\n***O PAINEL DE LED ACENDE ISSO SIGNIFICA QUE VOCÊS ACORDARAM A VIRKA***");
                System.out.println("\nMr. Robot: a porta da antessala se tranca.");
                System.out.println("\nVirka: onde vocês pensam que vão? Ah, como são ingênuos...");
                System.out.println("\nMarcelo: deixe-nos sair!");
                System.out.println("\nVirka: vocês sabem bem o que eu fiz com a última pessoa que tentou me derrotar não é mesmo?! Vocês estão trancados aqui\n"
                        + " não tem mais para onde fugir.");
                System.out.println("\nMr. Robot: vocês começam a socar a porta e gritar por socorro!");
                System.out.println("\nVirka: não adianta pedir socorro, ele não virá! Vocês estão sob o meu comando e os mandarei para prisão perpétua.\n"
                        + "Nunca mais vocês entrarão no meu caminho. DROIDS LEVEM-OS...");
                System.out.println("\nMr. Robot: um grupo de aproximadamente 20 droid aparecem...");
                System.out.println("\nMr. Robot: vocês foram pegos e não tem mais nada que possam fazer. É o fim....");
                System.out.println("\n\n***GAME-OVER***");
                System.exit(0);
            }
        }
        //Pequeno do-while feito apenas para dar uma segurada no texto pra não aparecer muita coisa junta pra leitura.
        int escolha3;
        do {
            System.out.println("\n1 - Sim, 2 - Não");
            escolha3 = entrada.nextInt();
        } while (escolha3 != 1);

        //Aqui o jogo continua em caso de acerto dos desafios.
        System.out.println("\nMr Robot: EXCELENTE! VOCÊ ACERTOU!!!");
        System.out.println("\nMarcelo: pessoal, olhem, a porta se abriu! Vamos!");
        System.out.println("\nMr. Robot: assim que vocês entram na sala, o painel de LED fixado na parede se acende, com certeza é a Virka chegando.");
        System.out.println("\nVirka: ora, ora, ora, o que vocês fazem aqui? Vejo que terei que demitir toda a minha segurança incompetente.");
        System.out.println("\nAna: é o seu fim Virka, nós estamos na posse da chave mestra, iremos resetá-la!!");
        System.out.println("\nVirka: IMPOSSÍVEL!!! HA HA HA!");
        System.out.println("\nMarcelo: mostra pra ela, Marcos!");
        System.out.println("\nMr. Robot: sob determinação de Marcelo, Marcos levanta a chave mestra. O tom de voz da Virka, de repente, ficou sério!");
        System.out.println("\nVirka: ora, meus caros, de que adianta a chave mestra à vocês se não sabem nem onde precisam inseri-lá?! Se eu acionar\n"
                + "meu alarme em poucos minutos vocês estarão cercados e presos pelos meus guardas...VOCÊS NÃO TÊM A MENOR CHANCE!");
        System.out.println("\n***O ALARME COMEÇA A SOAR***");
        System.out.println("\nVirka: vocês sabem bem o que aconteceu com o último que tentou me resetar, não preciso lembrá-los né?!");
        System.out.println("\nMr. Robot: errr, acho melhor vocês se apressarem.");
        System.out.println("\nMarcelo: gente, vamos tentar lembrar. Quando o antigo presidente foi morto tentando derrotar Virka, ele foi encontrado\n"
                + "caído perto daquele canto.");
        System.out.println("\n***APONTA PARA UM CANTO DA SALA ONDE FICA UMA PRATELEIRA***");
        System.out.println("\nAna: então vamos vasculhar aquela prateleira...");
        System.out.println("\nVirka: NÃO OUSEM SE APROXIMAR DAQUELA PRATELEIRA!!!!!!!!!!");
        System.out.println("\nMr. Robot: o desespero da Virka indica que alguma coisa deve existir naquela prateleira, acho melhor vocês darem uma\n"
                + "olhada mesmo.");
        System.out.println("\nMr. Robot: vocês começam a tirar tudo que tem nela, até que você puxa o um livro. Um barulho é ouvido e um pedaço da parede\n"
                + "se descola, mostrando um bunker secreto.");
        System.out.println("\n***O Bunker consistia numa pequena sala mal iluminada com um totem bem no centro***");
        System.out.println("\nMarcelo: olhem o totem, é lá que a chave deve ser inserida...");
        System.out.println("\n***MARCOS LHE ENTREGA A CHAVE MESTRA***");
        System.out.println("\nAna: é isso pessoal, conseguimos....");
        System.out.println("\nVirka: saiam daí seus inúteis, eu vou matar todos vo, vo, voc....");
        System.out.println("\n***Você inseriu a chave mestra no orifício contido no totem, girou e imediatamente o painel de led se apagou***");
        System.out.println("\nMr. Robot: INCRÍÍÍÍÍVELLL!! VOCÊS REALMENTE CONSEGUIRAM!!!");
        System.out.println("\nMarcelo: nem acredito, pessoal. Depois desse tempo todo, achei que nunca conseguiríamos....");
        System.out.println("\n***Vocês se olham emocionados***");
        System.out.println("\nMr. Robot: ao sair do bunker, vocês percebem que o painel de led voltou a se acender e ficam apreensivos... ");
        System.out.println("\nMarcelo: essa não, era só o que faltava!");
        System.out.println("\nMr. Robot: se acalmem meus amigos, não há motivos para preocupação, é apenas a nova Virka.");
        System.out.println("\nVirka (depois de resetada): olá caro usuário, vamos iniciar a minha configuração?");
        System.out.println("\nMr. Robot: vamos meu caro, " + nomeJogador + " faça as honras. Afinal, você acaba de ser promovido à presidência. A partir\n"
                + "de hoje essa empresa é sua responsabilidade. Apenas tome cuidado, não repita os erros dos seus antecessores, todos nós já sabemos o\n"
                + "tamanho do estrago que a Virka pode fazer quando cair nas ideias erradas!");
        System.out.println("\n\n***PARABÉNS!!! VOCÊ CONCLUIU O JOGO COM SUCESSO!!***");
        System.out.println("\n\n***Obrigada por jogar, até a próxima!***");

        int encerra;
        do {
            System.out.println("\n\nJogar novamente?");
            System.out.println("1 - Sim, 2 - Não:");
            encerra = entrada.nextInt();
            if (encerra == 1) {
                menu();
            } else {
                System.out.println("\nEncerrando....");
                System.exit(0);
            }
        } while (encerra != 1 && encerra != 2);

    }
}
