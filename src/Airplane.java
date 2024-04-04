public class Airplane {
        private String name;
        private String color;
        private int capacity;


        public Airplane(String name, String color, int capacity) {
            this.name = name;
            this.color = color;
            this.capacity = capacity;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public int getCapacity() {

            return capacity;
        }

        @Override
        public String toString() {
            return "Airplane{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", capacity=" + capacity +
                    '}';
        }
    }
