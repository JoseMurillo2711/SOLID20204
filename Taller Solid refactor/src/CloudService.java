public interface CloudService {
    void connect(AppWeb app);
}

public class AWSCloudService implements CloudService {
    public void connect(AppWeb app) {
        System.out.println("Connect to AWS");
        // Logic
    }
}

public class AzureCloudService implements CloudService {
    public void connect(AppWeb app) {
        System.out.println("Connect to Microsoft Azure");
        // Logic
    }
}

// public class CloudServicePlatform {

//     private int cloudServicePlatform;
    
//     public void hostingTo (AppWeb app) {
//         if (cloudServicePlatform==1) {
//             System.out.println("Connect to AWS");
//             // Logic
//         }if (cloudServicePlatform==2) {
//             System.out.println("Connect to Microsoft Azure");
//             // Logic
//         }else{
//             System.out.println("Connect to Google Cloud");
//             // Logic
//         }
//     }
//     // More Methods
// }

