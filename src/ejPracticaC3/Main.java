package ejPracticaC3;

    public class Main {
        public static void main(String[] args) {

            // 1. Probamos que la Arquitectura Singleton funciona
            SistemaLog miLog = SistemaLog.get_Instancia();
            SistemaLog otroLog = SistemaLog.get_Instancia();

            // Esto debería imprimir "true" demostrando que ambos apuntan al mismo objeto en memoria
            System.out.println("¿Son la misma instancia?: " + (miLog == otroLog));
            System.out.println("--------------------------------------------------");

            // 2. Probamos el flujo normal y la persistencia en texto
            String nombreArchivo = "registro_actividad.txt";

            miLog.escribirLog("Iniciando sistema de pruebas...");
            miLog.guardarLogEnArchivo(nombreArchivo, "Usuario admin se ha conectado.");
            miLog.guardarLogEnArchivo(nombreArchivo, "Se ha detectado una nueva conexión.");

            System.out.println("Revisa el panel izquierdo de tu IDE, debería aparecer el archivo '" + nombreArchivo + "'");
            System.out.println("--------------------------------------------------");

            // 3. Probamos que nuestra Red de Seguridad (Excepciones) funciona
            System.out.println("Intentando registrar un log nulo...");

            try {
                // Esto va a hacer explotar el método escribirLog
                miLog.escribirLog(null);

                // Si explota, esta línea jamás se ejecutará
                System.out.println("Esto no debería imprimirse.");

            } catch (IllegalArgumentException e) {
                // Atrapamos la bomba y el programa sigue vivo
                System.out.println("¡Excepción atrapada con éxito! Motivo: " + e.getMessage());
            }

            System.out.println("Fin del programa. El sistema no se cayó.");
        }
    }
