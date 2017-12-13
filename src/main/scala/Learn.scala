import Demo._

object Learn {
    def main(args: Array[String]): Unit = {
        4 times println("hello");
        val point = new Point(0, 0);
        point.move(1, 2);

        println(point.x);

        val location = new Location(0, 0, 0);
        location.move(1, 3, 2);
    }
}

class Point(val xc: Int, val yc: Int) {
    var x: Int = xc;
    var y: Int = yc;

    def move(dx: Int, dy: Int) {
        x = x + dx;
        y = y + dy;
        println ("Point x location : " + x);
        println ("Point y location : " + y);
    }
}

class Location(override val xc: Int, override val yc: Int,
               val zc :Int) extends Point(xc, yc) {
    var z: Int = zc;

    def move(dx: Int, dy: Int, dz: Int) {
        x = x + dx;
        y = y + dy;
        z = z + dz;
        println ("Point x location : " + x);
        println ("Point y location : " + y);
        println ("Point z location : " + z);
    }

}