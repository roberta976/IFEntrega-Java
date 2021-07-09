
import java.time.LocalDateTime;
import java.util.Scanner;

public class RealizaPedido {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        long idUser = 0;
        long idCliente = 0;
        long idEndereco = 0;
        long idAdicionalItem = 0;
        long idImagemProduto = 0;
        // long idItemPedido = 0;
        long idPedido = 0;
        long idStatusPedido = 0;

        Scanner t = new Scanner(System.in);

        while (true) {
            System.out.println("====================================");
            System.out.println("        RESTAURANTE IFEntrega");
            System.out.println("====================================\n");
            System.out.println(
                    "Olá! Que bom ter você aqui. Quer fazer um pedido?\nÉ bem simples, basta se cadastrar em nosso sistema!");
            System.out.println("Digite 1 para se cadastrar ou 2 para sair");
            int decisao = t.nextInt();

            if (decisao == 1) {
                clearScreen();
                System.out.println("====================================");
                System.out.println("        CADASTRO DE USUÁRIO ");
                System.out.println("====================================\n");

                System.out.println("Username: ");
                String username = t.next();

                System.out.println("Senha: ");
                String senha = t.next();

                System.out.println("Realizar seu cadastro?\n1 para sim ou 2 para cancelar ");

                int cadastrar = t.nextInt();
                if (cadastrar == 1) {
                    idUser += 1;
                    Usuario novoUser = new Usuario();
                    novoUser.setId(idUser);
                    novoUser.setUsername(username);
                    novoUser.setPassword(senha);
                    novoUser.setEnabled(true);
                    System.out.println(novoUser);

                    clearScreen();

                    System.out.println("====================================");
                    System.out.println("            DADOS PESSOAIS ");
                    System.out.println("====================================\n");

                    System.out.println("Nome: ");
                    String nomeCliente = t.next();

                    System.out.println("CPF: ");
                    String cpfCliente = t.next();

                    System.out.println("Nº de telefone: ");
                    String telefoneCliente = t.next();

                    System.out.println("Informe um telefone alternativo: ");
                    String telefoneAlternativo = t.next();

                    idCliente += 1;

                    System.out.println("Nome da rua: ");
                    String ruaEndereco = t.next();

                    System.out.println("Nº da residência: ");
                    String numeroEndereco = t.next();

                    System.out.println("Bairro: ");
                    String bairroEndereco = t.next();

                    System.out.println("CEP: ");
                    String cepEndereco = t.next();

                    System.out.println("Cidade: ");
                    String cidadeEndereco = t.next();

                    System.out.println("Estado: ");
                    String estadoEndereco = t.next();

                    System.out.println("Complemento: ");
                    String complementoEndereco = t.next();

                    System.out.println("====================================");
                    System.out.println("           CADASTRO REALIZADO ");
                    System.out.println("====================================\n");
                    System.out.println("            FAZER PEDIDO...");
                    System.out.println("====================================\n");
                    idEndereco += 1;
                    EnderecoCliente novoEndereco = new EnderecoCliente();
                    Cliente novoCliente = new Cliente();

                    novoCliente.setNome(nomeCliente);
                    novoCliente.setCpf(cpfCliente);
                    novoCliente.setFone(telefoneCliente);
                    novoCliente.setFoneAlternativo(telefoneAlternativo);
                    novoCliente.setUsuario(novoUser);
                    novoCliente.setId(idCliente);

                    novoEndereco.setRua(ruaEndereco);
                    novoEndereco.setNumero(numeroEndereco);
                    novoEndereco.setBairro(bairroEndereco);
                    novoEndereco.setCep(cepEndereco);
                    novoEndereco.setCidade(cidadeEndereco);
                    novoEndereco.setEstado(estadoEndereco);
                    novoEndereco.setComplemento(complementoEndereco);
                    novoEndereco.setId(idEndereco);

                    novoCliente.adicionarEndereco(novoEndereco);

                    novoEndereco.setCliente(novoCliente);

                    System.out.println(novoEndereco);
                    System.out.println("");
                    System.out.println(novoCliente);

                    // parte do pedido
                    clearScreen();
                    Categoria novaCategoria = new Categoria();
                    Produto novoProduto = new Produto();
                    ImagemProduto novaImagem = new ImagemProduto();
                    Adicional novoAdicional = new Adicional();
                    ItemPedido novoItem = new ItemPedido();

                    System.out.println("====================================");
                    System.out.println("               CATEGORIA ");
                    System.out.println("====================================\n");
                    System.out.println("1- MASSAS\n2- BEBIDAS\n3- SOBREMESAS\n");
                    System.out.println("Digite a sua opção: ");
                    int categoriaEscolhida = t.nextInt();
                    if (categoriaEscolhida == 1) {
                        novaCategoria.setId(1);
                        novaCategoria.setDescricao("MASSAS");

                        clearScreen();

                        System.out.println("====================================");
                        System.out.println("                MASSAS ");
                        System.out.println("====================================\n");
                        System.out.println(
                                "1-  Pizza Napolitana 342\n2-  Macarronada da casa 654\n3-  Crepe Baiano 890\n4-  Lasanha do Chefe 908\n");
                        System.out.println("Digite o código: ");
                        long idProduto = t.nextLong();
                        idImagemProduto += 1;
                        novoProduto.setId(idProduto);
                        if (idProduto == 1) {
                            novoProduto.setTitulo("Pizza Napolitana");
                            novoProduto.setDescricao("Ingredientes: queijo mussarela, tomate, cebola e ovo");
                            novoProduto.setValorUnitario(20.00);
                            novoProduto.setTempoEntrega("2 horas");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(342);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemPizza");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);

                        } else if (idProduto == 2) {
                            novoProduto.setTitulo("Macarronada da casa");
                            novoProduto.setDescricao("Ingredientes: queijo mussarela, macarrao, molho da casa, frango");
                            novoProduto.setValorUnitario(25.00);
                            novoProduto.setTempoEntrega("2 horas");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(654);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemMacarronada");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);

                        } else if (idProduto == 3) {
                            novoProduto.setTitulo("Crepe Baiano");
                            novoProduto.setDescricao("Ingredientes: queijo mussarela, charque, cebola e molho");
                            novoProduto.setValorUnitario(15.00);
                            novoProduto.setTempoEntrega("1 hora e 30 minutos");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(890);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemCrepe");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);

                        } else if (idProduto == 4) {
                            novoProduto.setTitulo("Lasanha do Chef");
                            novoProduto
                                    .setDescricao("Ingredientes: queijo mussarela, frango, catupiry e molho da casa");
                            novoProduto.setValorUnitario(20.00);
                            novoProduto.setTempoEntrega("2 horas");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(908);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemLasanha");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);
                        } else {
                            break;
                        }
                        System.out.println("----------------------------------------------");
                        System.out.println("Deseja inserir algum adicional? 1- sim/ 0- não");
                        int adicional = t.nextInt();
                        clearScreen();
                        if (adicional == 1) {
                            System.out.println("====================================");
                            System.out.println("                ADICIONAIS ");
                            System.out.println("====================================\n");
                            System.out.println(
                                    "CODIGO__PRODUTO__ID DE PROMOÇÃO\n1-  Borda recheada\n2-  Molho rosé\n3-  Batat frita\n");
                            System.out.println("Digite o código: ");
                            long idAdicional = t.nextLong();
                            novoAdicional.setId(idAdicional);
                            if (idAdicional == 1) {
                                novoAdicional.setDescricao("Recheio de catupiry");
                                novoAdicional.setTitulo("Borda recheada");
                                novoAdicional.setValor(3.00);
                            } else if (idAdicional == 2) {
                                novoAdicional.setDescricao("Molho");
                                novoAdicional.setTitulo("Molho Rosé");
                                novoAdicional.setValor(2.00);
                            } else if (idAdicional == 3) {
                                novoAdicional.setDescricao("Porção média");
                                novoAdicional.setTitulo("Batata Frita");
                                novoAdicional.setValor(8.00);
                            }
                        }

                    } else if (categoriaEscolhida == 2) {
                        novaCategoria.setId(2);
                        novaCategoria.setDescricao("BEBIDAS");

                        clearScreen();
                        System.out.println("====================================");
                        System.out.println("                BEBIDAS ");
                        System.out.println("====================================\n");
                        System.out.println(
                                "CODIGO__PRODUTO__ID DE PROMOÇÃO\n1-  Suco de Laranja 789\n2-  Whisky da casa 690\n3-  Água Mineral 554\n4-  Coca Cola Latinha 723\n");
                        System.out.println("Digite o código: ");
                        long idProduto = t.nextLong();

                        idImagemProduto += 1;
                        novoProduto.setId(idProduto);
                        if (idProduto == 1) {
                            novoProduto.setTitulo("Suco de Laranja");
                            novoProduto.setDescricao("500Ml da fruta");
                            novoProduto.setValorUnitario(9.00);
                            novoProduto.setTempoEntrega("30 minutos");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(789);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemSuco");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);

                        } else if (idProduto == 2) {
                            novoProduto.setTitulo("Macarronada da casa");
                            novoProduto.setDescricao("1Litro");
                            novoProduto.setValorUnitario(16.50);
                            novoProduto.setTempoEntrega("1 hora");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(690);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemWhisky");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);

                        } else if (idProduto == 3) {
                            novoProduto.setTitulo("Água Mineral");
                            novoProduto.setDescricao("1Litro");
                            novoProduto.setValorUnitario(5.00);
                            novoProduto.setTempoEntrega("20 minutos");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(554);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemÁgua");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);

                        } else if (idProduto == 4) {
                            novoProduto.setTitulo("Coca Cola Latinha");
                            novoProduto.setDescricao("500Ml");
                            novoProduto.setValorUnitario(5.70);
                            novoProduto.setTempoEntrega("25 minutos");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(723);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemCoca");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);
                        } else {
                            break;
                        }
                        System.out.println("----------------------------------------------");
                        System.out.println("Deseja inserir algum adicional? 1- sim/ 0- não");
                        int adicional = t.nextInt();
                        clearScreen();
                        if (adicional == 1) {
                            System.out.println("====================================");
                            System.out.println("                ADICIONAIS ");
                            System.out.println("====================================\n");
                            System.out.println("CODIGO__PRODUTO__ID DE PROMOÇÃO\n1-  Gelo\n2-  Leite");
                            System.out.println("Digite o código: ");
                            long idAdicional = t.nextLong();
                            novoAdicional.setId(idAdicional);
                            if (idAdicional == 1) {
                                novoAdicional.setDescricao("10 cubos");
                                novoAdicional.setTitulo("Gelo");
                                novoAdicional.setValor(2.00);
                            } else if (idAdicional == 2) {
                                novoAdicional.setDescricao("Misturado ao suco");
                                novoAdicional.setTitulo("Leite");
                                novoAdicional.setValor(3.50);
                            }
                        }

                    } else if (categoriaEscolhida == 3) {
                        novaCategoria.setId(3);
                        novaCategoria.setDescricao("SOBREMESAS");
                        clearScreen();
                        System.out.println("====================================");
                        System.out.println("                SOBREMESAS ");
                        System.out.println("====================================\n");
                        System.out.println(
                                "CODIGO__PRODUTO__ID DE PROMOÇÃO\n1-  Mousse de Maracujá 667\n2- Açaí com banana 991\n3-  Sorvete de Flocos 112\n4-  Delícia de Abacaxi 305\n");
                        System.out.println("Digite o código: ");
                        long idProduto = t.nextLong();

                        idImagemProduto += 1;
                        novoProduto.setId(idProduto);
                        if (idProduto == 1) {
                            novoProduto.setTitulo("Mousse de Maracujá");
                            novoProduto.setDescricao("Com cobetura");
                            novoProduto.setValorUnitario(10.00);
                            novoProduto.setTempoEntrega("30 minutos");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(667);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemMousse");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);

                        } else if (idProduto == 2) {
                            novoProduto.setTitulo("Açaí com banana");
                            novoProduto.setDescricao("500Ml");
                            novoProduto.setValorUnitario(9.50);
                            novoProduto.setTempoEntrega("1 hora");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(991);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemAçaí");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);

                        } else if (idProduto == 3) {
                            novoProduto.setTitulo("Sorvete de Flocos");
                            novoProduto.setDescricao("300ml");
                            novoProduto.setValorUnitario(5.40);
                            novoProduto.setTempoEntrega("20 minutos");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(112);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemSorvete");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);

                        } else if (idProduto == 4) {
                            novoProduto.setTitulo("Delícia de Abacaxi");
                            novoProduto.setDescricao("450ml");
                            novoProduto.setValorUnitario(5.70);
                            novoProduto.setTempoEntrega("25 minutos");
                            novoProduto.setCategoria(novaCategoria);
                            novoProduto.setPromocao_id(305);
                            novaImagem.setId(idImagemProduto);
                            novaImagem.setTitulo("ImagemDeliciaAbacaxi");
                            novoProduto.adicionarImagem(novaImagem);
                            novaImagem.setProduto(novoProduto);
                        } else {
                            break;
                        }
                        System.out.println("----------------------------------------------");
                        System.out.println("Deseja inserir algum adicional? 1- sim/ 0- não");
                        int adicional = t.nextInt();
                        clearScreen();
                        if (adicional == 1) {
                            System.out.println("====================================");
                            System.out.println("                ADICIONAIS ");
                            System.out.println("====================================\n");
                            System.out.println("CODIGO__PRODUTO__ID DE PROMOÇÃO\n1-  Cobertura\n2-  Nutella");
                            System.out.println("Digite o código: ");
                            long idAdicional = t.nextLong();
                            novoAdicional.setId(idAdicional);
                            if (idAdicional == 1) {
                                novoAdicional.setDescricao("Chocolate ou Morango");
                                novoAdicional.setTitulo("Cobertura");
                                novoAdicional.setValor(2.00);
                            } else if (idAdicional == 2) {
                                novoAdicional.setDescricao("Creme");
                                novoAdicional.setTitulo("Nutella");
                                novoAdicional.setValor(1.50);
                            }

                        }

                    } else {
                        break;
                    }

                    clearScreen();

                    System.out.println("");
                    // System.out.println(novoProduto);
                    StatusPedido novoStatus = new StatusPedido();

                    novoStatus.setId(idStatusPedido += 1);
                    novoStatus.setDescricao("Produto escolhido");

                    Pedido novoPedido = new Pedido();

                    novoPedido.setCliente(novoCliente);
                    novoPedido.setDataHora(LocalDateTime.now());
                    novoPedido.setId(idPedido += 1);
                    novoPedido.setStatusPedido(novoStatus);

                    novoItem.setId(1);
                    novoItem.setProduto(novoProduto);

                    AdicionalItemPedido adicionalItemPedido = new AdicionalItemPedido();
                    adicionalItemPedido.setAdicional(novoAdicional);

                    // adicionando a quantidade de adicionais
                    System.out.println("Digite a quantidade de adicionais: ");
                    int quantidadeAdicional = t.nextInt();
                    adicionalItemPedido.setQuantidade(quantidadeAdicional);
                    adicionalItemPedido.setId(idAdicionalItem += 1);

                    // calculo do custo dos adicionais e setando os custos
                    double valorTotalDoAdicional = (novoAdicional.getValor() * quantidadeAdicional);
                    adicionalItemPedido.setValorAdicionais(valorTotalDoAdicional);

                    System.out.println("Escreva sua observação: ");
                    String observacao = t.next();

                    // A MESMA OBSERVAÇÃO
                    novoItem.setObservacao(observacao);
                    novoPedido.setObservacao(observacao);
                    novoItem.setPedido(novoPedido);

                    // VALOR TOTAL DO ITEM UNITARIO
                    double valorTotaldoItem = (valorTotalDoAdicional + novoProduto.getValorUnitario());
                    novoItem.setValorTotal(valorTotaldoItem);

                    novoPedido.adicionarItem(novoItem);
                    adicionalItemPedido.setItemPedido(novoItem);

                    System.out.println("Deseja levar mais de um desse? se sim quantos?\nCaso não queira, apenas digite 0. ");
                    int quantidadeItem = t.nextInt();
                    novoItem.setQuantidade(quantidadeItem + 1);

                    // Loop para criar varios itens
                    // int idDoItem = 1;
                    for (long i = 0; i < quantidadeItem; i++) {
                        // idDoItem +=1;
                        // novoItem.setId(idDoItem+= 1);
                        novoPedido.adicionarItem(novoItem);
                        
                    }
                    // quantidade itens + status
                    double valorTotalPedido = valorTotaldoItem * novoItem.getQuantidade();
                    String valorFomatado = String.format("%.2f", valorTotalPedido);

                    novoPedido.setValorTotalItem(valorFomatado);
                    
                    novoItem.adicionarAdiconalPedido(adicionalItemPedido);
                    novoStatus.setDescricao("Saindo para entrega!");
                    novoPedido.setStatusPedido(novoStatus);

                    clearScreen();

                    System.out.println("Detalhes do pedido: \n");
                    novoPedido.listarItensPedido();
                    System.out.println("====================");
                    System.out.println("Valor Total: " + novoPedido.getValorTotalItem());

                    // colocar o remover
                    System.out.println("");
                    System.out.println("Deseja remover algum? Se sim, digite a quantidade \nCaso não queira, digite qualquer numero");
                    int remover = t.nextInt();
                    if (remover > 0) {
                        for (int i = 0; i < remover; i++){
                            novoPedido.removerItem(novoItem);
                        }
                        System.out.println("====================");
                        double retirarItem = valorTotalPedido - (valorTotaldoItem * (novoItem.getQuantidade()-remover));
                        novoPedido.setValorTotalItem("Valor Total: " + retirarItem);
                        System.out.println("" + novoPedido.getValorTotalItem());
                        novoItem.setQuantidade(novoItem.getQuantidade() - remover);
                        clearScreen();
                        System.out.println("====================================");
                        System.out.println("        SAINDO PARA ENTREGA! ");
                        System.out.println("====================================\n");
                        novoPedido.listarItensPedido();
                        novoPedido.setValorTotalItem("Valor Total: " + retirarItem);
                        System.out.println("" + novoPedido.getValorTotalItem());
                        break;
                        
                        
                       
                    }
                    

                } else if (cadastrar == 2) {
                    clearScreen();
                    System.out.println("====================================");
                    System.out.println("        FIM DE SESSÃO");
                    System.out.println("====================================\n");
                    break;
                } else {
                    System.out.println("Opção inválida. Digite novamente!");
                    clearScreen();
                }

            } else if (decisao == 2) {
                clearScreen();
                System.out.println("====================================");
                System.out.println("        FIM DE SESSÃO");
                System.out.println("====================================\n");
                break;
            } else {
                System.out.println("Opção inválida. Digite novamente!");
                clearScreen();
            }
          
        }t.close();  

    }
}
