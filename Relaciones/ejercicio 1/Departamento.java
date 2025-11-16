package relaciones;
public class Departamento {
    private String nombre,area;
    private  int nroEmpleados;
    private Empleado n[]=new Empleado[20];
    
    
    public Departamento(){
        nombre="A1";
        area="social";
        nroEmpleados=5;
        n[0]=new Empleado("Jhon");
        n[1]=new Empleado();
        n[2]=new Empleado("Arturo");
        n[3]=new Empleado("Gael");
        n[4]=new Empleado("Miguel");
      
    }
    public Departamento(int a){
        nombre="A2";
        area="familiar";
        nroEmpleados=a;
         for(int i=0;i<nroEmpleados;i++){
             n[i]=new Empleado();
         }
    }
    
    public void mostrarEmpleados(){
        System.out.println(nombre+" "+area+" "+nroEmpleados+"  empleados");
        if (nroEmpleados==0){
            System.out.println("Este departamento no tiene ningun empleado");
        }
        for(int i=0;i<nroEmpleados;i++){
             n[i].mostrar();
         }
    }
    
    public void cambiarSalario( double c){
        for(int i=0;i<nroEmpleados;i++){
             n[i].setSueldo(c);
        }
    }
    
    public void verificarSiPertenece(Departamento c){
        int  k=0;
         for(int i=0;i<nroEmpleados;i++){
              for(int j=0;j<c.getNroEmpleados();j++){
                  if((n[i].getNombre()).equals(c.n[j].getNombre())){
                      System.out.println(n[i].getNombre()+"Pertenece a  ambos departamentos");
                      k++;
                  }
               }
         }
         if(k==0)
             System.out.println("Ningun empleado pertenece a ambos departamentos");
    }

   public void cambiarEmpleados(Departamento z) {
    Empleado[] temp = n;
    n = z.getN();
    z.setN(temp);
    int aux = nroEmpleados;
    nroEmpleados = z.getNroEmpleados();
    z.setNroEmpleados(aux);
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public int getNroEmpleados() {
        return nroEmpleados;
    }
    public void setNroEmpleados(int nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
    }
    public Empleado[] getN() {
        return n;
    }
    public void setN(Empleado[] n) {
        this.n = n;
    }
}

