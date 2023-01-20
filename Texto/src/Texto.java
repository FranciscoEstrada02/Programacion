public class Texto {
    private String tamaño;
    private String tipografia;
    private Colores colores;
    private String contenido;
    private boolean tachada;
    private boolean negrita;
    private boolean subrayada;
    private boolean italica;

    public Texto(String contenido, Colores colores,String tamaño) {
        this.tamaño = tamaño;
        this.tipografia = tipografia;
        this.colores = colores;
        this.contenido = contenido;
        this.tachada = tachada;
        this.negrita = negrita;
        this.subrayada = subrayada;
        this.italica = italica;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipografia() {
        return tipografia;
    }

    public void setTipografia(String tipografia) {
        this.tipografia = tipografia;
    }

    public Colores getColores() {
        return colores;
    }

    public void setColores(Colores colores) {
        this.colores = colores;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTachada() {

        if(this.tachada == true){
            return "ES TACHADA";
        }
        return "NO ES TACHADA";
    }


    public String getNegrita() {
        if(this.tachada == true){
            return "ES NEGRITA";
        }
        return "NO ES NEGRITA";
    }

    public String getSubrayada() {
        if(this.tachada == true){
            return "ES SUBRAYADA";
        }
        return "NO ES SUBRAYADA";
    }

    public String getItalica() {
        if(this.tachada == true){
            return "ES ITALICA";
        }
        return "NO ES ITALICA";
    }


}

