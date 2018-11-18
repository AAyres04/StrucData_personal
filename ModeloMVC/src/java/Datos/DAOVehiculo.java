package Datos;

import Modelo.Marca;
import Modelo.Vehiculo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DAOVehiculo {
    public ArrayList<Vehiculo> loadDataVehiculos(String archivo) throws ParseException{
        FileHandler f = new FileHandler("/home/souriez/StrucData_personal/ModeloMVC/");
        System.out.println(System.getProperty("user.dir"));
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<String> datos = f.lectura(archivo);
        datos.remove(0);
        for (String lectura : datos) {
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String[] split = lectura.split(";");
            Vehiculo v = new Vehiculo();
            v.setMatricula(split[0]);
            v.setChasis(split[1]);
            v.setEjes(Integer.parseInt(split[2]));
            v.setMarca(Marca.valueOf(split[3]));
            v.setKilometraje(Integer.parseInt(split[4]));
            v.setKilometrajeMantencion(Integer.parseInt(split[5]));
            v.setFechaCompra(formatter.parse(split[6]));
            v.setFechaUltimaMantencion(formatter.parse(split[7]));
            v.setFechaUltimoProblema(formatter.parse(split[8]));
            v.setnProblemas(Integer.parseInt(split[9]));
            vehiculos.add(v);
        }
        return vehiculos;
    }
}
