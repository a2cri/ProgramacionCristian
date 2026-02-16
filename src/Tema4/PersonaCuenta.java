package Tema4;
public class PersonaCuenta {

        private final String dni;
        private final Cuenta[] cuentas;
        private int numCuentas;

        // Constructor vacío con valores por defecto
        public PersonaCuenta() {
            this.dni = "Sin DNI";
            this.cuentas = new Cuenta[3];
            this.numCuentas = 0;
        }

        public PersonaCuenta(final String dni) {
            this.dni = dni;
            this.cuentas = new Cuenta[3];
            this.numCuentas = 0;
        }

        public String getDni() {
            return dni;
        }

        public boolean addCuenta(final Cuenta cuenta) {
            boolean exito = false;
            if (numCuentas < 3) {
                cuentas[numCuentas] = cuenta;
                numCuentas++;
                exito = true;
            }
            return exito;
        }

        public boolean esMorosa() {
            boolean morosa = false;
            int i = 0;
            while (i < numCuentas && !morosa) {
                if (cuentas[i].getSaldo() < 0) {
                    morosa = true;
                }
                i++;
            }
            return morosa;
        }

        public Cuenta getCuenta(final int posicion) {
            Cuenta temporal = null;
            if (posicion >= 0 && posicion < numCuentas) {
                temporal = cuentas[posicion];
            }
            return temporal;
        }

        public String toString() {
            return "DNI: " + dni + " | Cuentas: " + numCuentas;
        }
    }