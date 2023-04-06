import com.dynamo.bob.archive.ResourceEncryptionPlugin;
import com.dynamo.crypt.Crypt;

public class CustomResourceEncryption extends ResourceEncryptionPlugin {
	private final byte[] KEY = "GAZVwlJL0W6U874e".getBytes();

	@Override
	public byte[] encrypt(byte[] resource) throws Exception {
		System.out.println("encrypt");
		return Crypt.encryptCTR(resource, KEY);
	}
}
