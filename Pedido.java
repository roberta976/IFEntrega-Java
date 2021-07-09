import java.time.LocalDateTime;
import java.util.ArrayList;


public class Pedido {
    private long id;
    private Cliente cliente;
    private ArrayList<ItemPedido> itemPedido = new ArrayList<>();
    private StatusPedido statusPedido;
    private String observacao;
    private String valorTotalItem;
    private LocalDateTime dataHora;


    public Pedido(){

    }

    public Pedido(long id, Cliente cliente, StatusPedido statusPedido,
            String observacao, String valorTotalItem, LocalDateTime dataHora) {
        this.id = id;
        this.cliente = cliente;
        this.statusPedido = statusPedido;
        this.observacao = observacao;
        this.valorTotalItem = valorTotalItem;
        this.dataHora = dataHora;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(String valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime localDateTime) {
        this.dataHora = localDateTime;
    }
    public void adicionarItem(ItemPedido item){
        itemPedido.add(item);
        System.out.println(itemPedido.indexOf(item));
    };

    //metodos 
    public void removerItem(ItemPedido item){
       

        // Removendo o item:
        for(int i = 0; i < itemPedido.size(); i++){
            ItemPedido p = itemPedido.get(i);

            if(p.equals(item))
            {
                // remove o item.
                itemPedido.remove(p);

                // Sai do loop.
                break;
            }
        }

    }    
    public void listarItensPedido(){
        System.out.print("Itens do pedido:\n");
        for(int i = 0; i < itemPedido.size(); i++){
            System.out.print(itemPedido.get(i) + "\n");
            System.out.print("-----------------------\n");
        }
        
    }
    
    
    @Override
    public String toString() {
        // System.out.println(h.getDayOfMonth() + "/" + h.getMonthValue() + "/" + h.getYear() + " " + h.getHour() + ":" + h.getMinute());
        return "\nData e Hora: " + (dataHora.getDayOfMonth()+ "/" + dataHora.getMonthValue() + "/" + dataHora.getYear() + " " + dataHora.getHour() + ":" + dataHora.getMinute()) + "\nStatus: " + statusPedido;
    }
    
    
    //for (cliente objetoCliente : cl) { System.out.println(objetoCliente.getNome()); }

    
  
    
}
