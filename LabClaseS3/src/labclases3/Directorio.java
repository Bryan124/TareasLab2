package labclases3;

import java.util.ArrayList;

public class Directorio extends Objeto{
    
    protected String permisos;
    private ArrayList<Objeto> direct;
    private ArrayList<Directorio> directx;
    
    public Directorio(String n, int y){
        super(n, y);
        this.direct = null;
        this.directx = null;
    }
    public Directorio(String n,int y,ArrayList<Objeto> directorio,ArrayList<Directorio> directoriox){
        super(n,y);
        this.nombre = n;
        this.tamano = y;
        this.direct = directorio;
        this.directx = directoriox;
    }
    
    public void addDirectorio(Directorio nuevo){
        if(direct != null){
            direct.add(nuevo);
        }
        else{
            direct = new ArrayList<>();
            direct.add(nuevo);
        }
    }
    public void addObjeto(Objeto nuevo){
        if(directx != null){
            directx.add((Directorio) nuevo);
        }
        else{
            directx = new ArrayList<>();
            directx.add((Directorio) nuevo);
        }
    }
    @Override
    public Objeto buscar_Objeto(String nombre){
        if(nombre.equals(this.nombre))
            return this;
        
        if(this.direct == null)
            return null;
        else
        {
            for(int i = 0; i < direct.size(); i++)
            {
                Objeto tmp = direct.get(i);
                tmp = tmp.buscar_Objeto(nombre);
                if(tmp != null)
                    return tmp;
            }
        }
        
        return null;
    }
    
    
    
    
    
    
}
