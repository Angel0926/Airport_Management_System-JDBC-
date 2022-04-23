import dao.AddressDao;
import dao.CompanyDao;
import dao.PassengerDao;
import dao.TripDao;
import dao.impl.AddressDaoImpl;
import dao.impl.CompanyDaoImpl;
import dao.impl.PassengerDaoImpl;
import dao.impl.TripDaoImpl;
import model.Trip;
import resource.IOimpl.*;
import service.impl.CompanyServiceImpl;
import service.impl.PassengerServiceImpl;
import service.impl.TripServiceImpl;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

public class AMS_app {

    public static void main(String[] args) {
        AddressDao addressDao = new AddressDaoImpl();
        CompanyDao companyDao = new CompanyDaoImpl();
        PassengerDao passengerDao = new PassengerDaoImpl();
        TripDao tripDao = new TripDaoImpl();
        TripServiceImpl tripService=new TripServiceImpl();
PassengerServiceImpl passengerService=new PassengerServiceImpl();
        System.out.println(tripService.getTripsTo("Paris"));
       // AddressIOimpl.getAddressFromFile();
       // PassengerIOImpl.getPassengersFromFile();
        // CompanyIOImpl.getCompanyFromFile();
         // TripIOimpl.getTripFromFile();
       // PassInTripIOImpl.getPassInTripFromFile();

    }
}