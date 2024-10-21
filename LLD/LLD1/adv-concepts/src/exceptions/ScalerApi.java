package exceptions;

import java.io.FileNotFoundException;

public class ScalerApi {
    final static int limit = 5;

    void callApi(int times) throws OutofQuotaException, FileNotFoundException {
        for(int i=0; i<times; i++){
            if(i == limit){
                throw new OutofQuotaException();
            }
            if(i == 4){
                throw new FileNotFoundException();
            }
            System.out.println("Hello");
        }
    }
}
