package com.example.demo.PracticeActivities;
import java.util.*;

class PhoneBook {
    private final Map<String, Collection<PhoneNumber>> nameToPhoneNumbersMap = new HashMap<>();
    public void addNewPhoneNumbers(String name, Collection<PhoneNumber> numbers) {
       if(nameToPhoneNumbersMap.containsKey(name)){
            for (PhoneNumber num: numbers) {
                nameToPhoneNumbersMap.get(name).add(num);
            }
       } else
           nameToPhoneNumbersMap.put(name, numbers);
    }
    public void printPhoneBook() {
        for (Map.Entry<String, Collection<PhoneNumber>> c : nameToPhoneNumbersMap.entrySet()) {
            System.out.println(c.getKey());
            for (PhoneNumber f : c.getValue()) {
                System.out.println(f.getType()+": "+f.getNumber());
            }
        }
    }
}
class PhoneNumber {
    private PhoneNumberType type;
    private String number;
    enum PhoneNumberType {
        MOBILE, HOME, WORK,
    }
    public PhoneNumber(PhoneNumberType type, String number) {
        this.type = type;
        this.number = number;
    }
    public PhoneNumberType getType() {
        return type;
    }
    public String getNumber() {
        return number;
    }
}
public class PA11C {
    //test
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        List<PhoneNumber> claraPhoneNumbers = new ArrayList<>();
        claraPhoneNumbers.add(new PhoneNumber(PhoneNumber.PhoneNumberType.HOME, "723324324"));
        phoneBook.addNewPhoneNumbers("Clara", claraPhoneNumbers);
        List<PhoneNumber> kevinPhoneNumbers = new ArrayList<>();
        kevinPhoneNumbers.add(new PhoneNumber(PhoneNumber.PhoneNumberType.WORK, "1231"));
        phoneBook.addNewPhoneNumbers("Kevin", kevinPhoneNumbers);
        phoneBook.addNewPhoneNumbers("Clara", List.of(new PhoneNumber(PhoneNumber.PhoneNumberType.MOBILE, "23424279")));
        phoneBook.addNewPhoneNumbers("Paul", List.of(new PhoneNumber(PhoneNumber.PhoneNumberType.WORK, "56756335")));
        phoneBook.printPhoneBook();
    }
}