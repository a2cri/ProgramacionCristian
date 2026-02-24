import java.util.*;

public class AcortadorClases {

    private HashMap<String,String> mapa;

    public AcortadorClases() {
        this.mapa = new HashMap<>();
    }

    public AcortadorClases(HashMap<String, String> mapa) {
        this.mapa = mapa;
    }

    public HashMap<String, String> getMapa() {
        return mapa;
    }

    public void setMapa(HashMap<String, String> mapa) {
        this.mapa = mapa;
    }


    public String crear(String url){
        String clave;
        do{
            clave=generarClave();
        }while(mapa.containsKey(clave));
        mapa.put(clave,url);
        return "http://acortar.link/"+clave;
    }

    public String resolver(String clave){
        return mapa.getOrDefault(clave,null);
    }

    private String generarClave() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder clave = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            clave.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }

        return clave.toString();
    }


    public boolean borrar(String clave) {
        return mapa.remove(clave) != null;
    }


    public void mostrarTodos() {
        if (mapa.isEmpty()) {
            System.out.println("No hay registros.");
        } else {
            mapa.forEach((k, v) -> System.out.println("https://acortar.link/" + k + " → " + v));
        }
    }

}