package Gestion_Repartos.Mundo;

import Gestion_Repartos.Transporte;

public class GeneradorMundo {
    public static Mundo generate() {
        Mundo mundo = new Mundo();

        // ===== PAÍSES =====
        Pais espana = new Pais("España");
        Pais italia = new Pais("Italia");
        Pais rusia = new Pais("Rusia");
        Pais eeuu = new Pais("Estados Unidos");
        Pais argentina = new Pais("Argentina");

        mundo.agregarPais(espana);
        mundo.agregarPais(italia);
        mundo.agregarPais(rusia);
        mundo.agregarPais(eeuu);
        mundo.agregarPais(argentina);

        // ===== CIUDADES Y CENTROS POR PAÍS =====
        // España
        Ciudad madrid = new Ciudad("Madrid");
        Ciudad barcelona = new Ciudad("Barcelona");
        Ciudad valencia = new Ciudad("Valencia");
        Ciudad sevilla = new Ciudad("Sevilla");

        agregarCiudadConCentros(espana, madrid);
        agregarCiudadConCentros(espana, barcelona);
        agregarCiudadConCentros(espana, valencia);
        agregarCiudadConCentros(espana, sevilla);

        // Italia
        Ciudad roma = new Ciudad("Roma");
        Ciudad milan = new Ciudad("Milán");
        Ciudad napoles = new Ciudad("Nápoles");
        Ciudad turin = new Ciudad("Turín");

        agregarCiudadConCentros(italia, roma);
        agregarCiudadConCentros(italia, milan);
        agregarCiudadConCentros(italia, napoles);
        agregarCiudadConCentros(italia, turin);

        // Rusia
        Ciudad moscu = new Ciudad("Moscú");
        Ciudad sanPetersburgo = new Ciudad("San Petersburgo");
        Ciudad novosibirsk = new Ciudad("Novosibirsk");
        Ciudad ekaterimburgo = new Ciudad("Ekaterimburgo");

        agregarCiudadConCentros(rusia, moscu);
        agregarCiudadConCentros(rusia, sanPetersburgo);
        agregarCiudadConCentros(rusia, novosibirsk);
        agregarCiudadConCentros(rusia, ekaterimburgo);

        // EE.UU.
        Ciudad nuevaYork = new Ciudad("Nueva York");
        Ciudad losAngeles = new Ciudad("Los Ángeles");
        Ciudad chicago = new Ciudad("Chicago");
        Ciudad houston = new Ciudad("Houston");

        agregarCiudadConCentros(eeuu, nuevaYork);
        agregarCiudadConCentros(eeuu, losAngeles);
        agregarCiudadConCentros(eeuu, chicago);
        agregarCiudadConCentros(eeuu, houston);

        // Argentina
        Ciudad buenosAires = new Ciudad("Buenos Aires");
        Ciudad laPlata = new Ciudad("La Plata");
        Ciudad rosario = new Ciudad("Rosario");
        Ciudad mendoza = new Ciudad("Mendoza");

        agregarCiudadConCentros(argentina, buenosAires);
        agregarCiudadConCentros(argentina, laPlata);
        agregarCiudadConCentros(argentina, rosario);
        agregarCiudadConCentros(argentina, mendoza);

        // ====== TRANSPORTES =======
        System.out.println("\nCreando vehículos...");
        for (int i = 1; i <= 3; i++) {
            System.out.println(new Transporte("AV-00" + i, "Avion", "disponible", 20000, 150, 800, 2000));
            System.out.println(new Transporte("BA-00" + i, "Barco", "disponible", 30000, 500, 50, 800));
            System.out.println(new Transporte("TR-00" + i, "Tren", "disponible", 15000, 120, 160, 400));
            System.out.println(new Transporte("CA-00" + i, "Camion", "disponible", 10000, 80, 120, 200));
            System.out.println(new Transporte("BI-00" + i, "Bicicleta", "disponible", 50, 1, 30, 5));
            System.out.println(new Transporte("CO-00" + i, "Coche", "disponible", 200, 3, 70, 30));
            System.out.println(new Transporte("PI-00" + i, "A Pie", "disponible", 20, 0.2, 5, 2));
        }

        // ===== CONEXIONES INTERNACIONALES (BIDIRECCIONALES) =====
        conectarBidireccional(mundo, espana, italia, 1500, "Barco");
        conectarBidireccional(mundo, italia, rusia, 3000, "Avion");
        conectarBidireccional(mundo, espana, eeuu, 6000, "Barco");
        conectarBidireccional(mundo, eeuu, argentina, 8000, "Avion");
        conectarBidireccional(mundo, rusia, argentina, 14000, "Barco");

        // ===== CONEXIONES ENTRE CIUDADES =====
        // España
        espana.conectarCiudadesBidireccional(madrid, barcelona, 620, "Camion");
        espana.conectarCiudadesBidireccional(madrid, valencia, 350, "Camion");
        espana.conectarCiudadesBidireccional(valencia, barcelona, 350, "Tren");
        espana.conectarCiudadesBidireccional(madrid, sevilla, 530, "Camion");

        // Italia
        italia.conectarCiudadesBidireccional(roma, milan, 570, "Tren");
        italia.conectarCiudadesBidireccional(roma, napoles, 230, "Camion");
        italia.conectarCiudadesBidireccional(milan, turin, 140, "Camion");

        // Rusia
        rusia.conectarCiudadesBidireccional(moscu, sanPetersburgo, 715, "Tren");
        rusia.conectarCiudadesBidireccional(moscu, novosibirsk, 3300, "Camion");
        rusia.conectarCiudadesBidireccional(novosibirsk, ekaterimburgo, 1700, "Camion");

        // EE.UU.
        eeuu.conectarCiudadesBidireccional(nuevaYork, chicago, 1145, "Camion");
        eeuu.conectarCiudadesBidireccional(chicago, houston, 1750, "Tren");
        eeuu.conectarCiudadesBidireccional(nuevaYork, losAngeles, 4500, "Camion");

        // Argentina
        argentina.conectarCiudadesBidireccional(buenosAires, laPlata, 60, "Camion");
        argentina.conectarCiudadesBidireccional(buenosAires, rosario, 300, "Tren");
        argentina.conectarCiudadesBidireccional(rosario, mendoza, 1000, "Camion");


        return mundo;
    }

    private static void agregarCiudadConCentros(Pais pais, Ciudad nombreCiudad) {
        for (int i = 1; i <= 3; i++) {
            nombreCiudad.agregarCentro(new Centros_Logisticos("Centro " + nombreCiudad + " #" + i, 800 + i * 100));
        }
        pais.agregarCiudad(nombreCiudad);
    }

    private static void conectarBidireccional(Mundo mundo, Pais a, Pais b, double distancia, String tipomedio) {
        mundo.conectarPaises(a, b, distancia, tipomedio);
        mundo.conectarPaises(b, a, distancia, tipomedio);
    }


}
