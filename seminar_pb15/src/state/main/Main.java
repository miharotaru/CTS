package state.main;


import state.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz= new Autobuz(99);

        /// la strate pot modifica o stare in state nuu
        //setState nu trebuie modificate si e de tip protected

        autobuz.trimiteInService();
        autobuz.pleacaInCursa();
        autobuz.ieseDinService();
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatLinie();
        autobuz.trimiteInService();
        autobuz.ajungeLaCapatLinie();

    }
}
