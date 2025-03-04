package optionals;

import java.util.NoSuchElementException;

public class PhoneBookCrawler {

    private PhoneBook2 phoneBook;

    public PhoneBookCrawler(PhoneBook2 phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElseThrow(() ->
                new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElse(phoneBook.toString());
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return null;
    }

    public PhoneBook2 getPhoneBook(){
        return phoneBook;
    }

}
