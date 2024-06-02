package conversorApi;


    public class ConversorMoedas {
        private String base_code;
        private String target_code;
        double conversion_result;
        double conversion_rate;
        double valor;

        public ConversorMoedas(String base_code, String target_code, double valor) {
            this.base_code = base_code;
            this.target_code = target_code;
            this.valor = valor;
        }

        public String getBase_code() {
            return base_code;
        }

        public String getTarget_code() {
            return target_code;
        }

        public double getConversion_result() {
            return conversion_result;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public String toString() {
            return "\n::::: " +
                    "\n\tValor a converter: " + conversion_rate +
                    "\n\tMoeda Base: " + base_code +
                    ", \n\tMoeda para Converter: " + target_code +
                    ", \n\tvalorConvertido: " + conversion_result +
                    "\n::::: \n";
        }
    }