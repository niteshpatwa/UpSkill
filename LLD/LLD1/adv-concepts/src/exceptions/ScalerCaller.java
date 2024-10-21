package exceptions;

public class ScalerCaller {
    public static void main(String[] args) {
        ScalerApi scalerApi = new ScalerApi();

        try{
            scalerApi.callApi(10);
        } catch (OutofQuotaException | RuntimeException e) {
            System.out.println("We are out of quota now.");
        } catch (Throwable e){
            System.out.println("Something random happened.");
        } finally {
            System.out.println("Finally we are here.");
        }

        System.out.println("Okay Bye");
    }
}
