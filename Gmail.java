public class Gmail 
{
    public static void sendEmail() 
	{
        boolean isRecipientValid = true;
        int attachmentSize = 10;

        if (isRecipientValid) {
            System.out.println("Email sent");
        }
        if (!isRecipientValid) {
            System.out.println("Invalid recipient");
        }
        if (attachmentSize > 25) {
            System.out.println("Attachment size too large");
        }
        if (attachmentSize > 0 && attachmentSize <= 25) {
            System.out.println("Email sent with attachment");
        }
        if (attachmentSize == 0) {
            System.out.println("Email sent without attachment");
        }
    }

    public static void receiveEmail() 
	{
        boolean isNewEmail = true;
        boolean isSpam = false;
        int emailCount = 5;

        if (isNewEmail) {
            System.out.println("New email received");
        }
        if (!isNewEmail) {
            System.out.println("No new emails");
        }
        if (isSpam) {
            System.out.println("Email marked as spam");
        }
        if (!isSpam) {
            System.out.println("Email marked as important");
        }
        if (emailCount > 10) {
            System.out.println("Inbox full, please delete some emails");
        }
    }

    public static void deleteEmail() 
	{
        boolean isSelected = true;
        boolean isTrashEmpty = false;
        int emailCount = 5;

        if (isSelected) {
            System.out.println("Email deleted");
        }
        if (!isSelected) {
            System.out.println("No email selected");
        }
        if (isTrashEmpty) {
            System.out.println("Trash is empty");
        }
        if (!isTrashEmpty) {
            System.out.println("Email moved to trash");
        }
        if (emailCount > 100) {
            System.out.println("Too many emails, consider deleting some");
        }
    }
}

