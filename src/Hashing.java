/**
 * Built uses built in java methods for equality and set hashing
 */
class PersonBuiltInHashCode{
    String firstName;
    String lastName;
    PersonBuiltInHashCode(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}


/**
 * Overrides the built in java methods so that every Person is the same.
 */
class PersonBadHashCode {
    String firstName;
    String lastName;
    PersonBadHashCode(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

}


/**
 * Overrides the built in java methods so that different people are not equal
 */
class PersonGoodHashCode {
    String firstName;
    String lastName;
    PersonGoodHashCode(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() * 31 + lastName.hashCode();
    }


    @Override
    public boolean equals(Object o) {

        // null check
        if (o == null) {
            return false;
        }

        // this instance check
        if (this == o) {
            return true;
        }

        // instanceof Check and actual value check
        if (o instanceof PersonGoodHashCode) {
            PersonGoodHashCode p = (PersonGoodHashCode) o;
            return p.firstName == this.firstName && p.lastName == this.lastName;
        } else {
            return false;
        }
    }

}


/**
 * Overrides the built in java methods so that different people are equal if their last names are equal;
 * TODO
 */
class PersonSelectiveHashCode {
    String firstName;
    String lastName;
    PersonSelectiveHashCode(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

