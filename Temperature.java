public class Temperature{
    public static double CtoF(double t){
	return (t * (9 / 5) + 32);
    }
    public static double FtoC(double t){
	return ((t - 32) * (5 / 9));
    }
}
