public class HelloWorld{
    class point{
        private int x,y;
        public void set(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    class colorpoint extends point{
        private String color;
        public void setColor(String color){
            this.color = color;
        }
    }
}