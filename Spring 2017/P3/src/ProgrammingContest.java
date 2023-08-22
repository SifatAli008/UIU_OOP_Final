
import java.util.Scanner;

public class ProgrammingContest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter team member count");
        int teamCount = scan.nextInt();
        try {
            checkTeamCount(teamCount);
        } catch (InvalidMemberCountException e) {
            System.out.println(e);
        }

        int creditComp = 0;

        for (int i = 0; i < teamCount; i++) {
            System.out.println("Please enter the credit completed by member " + (i + 1));
            creditComp = scan.nextInt();
            try {
                checkCredit(creditComp);
            } catch (InvalidTeamMemberException ex) {
                System.out.println(ex);
            }
        }
    }

    public static void checkTeamCount(int count) throws InvalidMemberCountException {

        if (count < 3 && count > 5) {
            throw new InvalidMemberCountException("Invalid  Number of Member");
        }

    }

    public static void checkCredit(int credit) throws InvalidTeamMemberException {
      if (credit <100) {
            throw new InvalidTeamMemberException("Invalid Team Member ");
        }

    }
}
