package PadroesDeProjeto.Comportamental.Oberver.AgenciaDeNoticias;

// essa interface vão ser os Jornais e TVs que recebem notificações 
// quando uma agencia de noticia publica uma noticia
public interface Observer {
    public void update(String noticia);
}
