package com.example.encryptstring;

import com.string.encryption.annotation.EncryptString;
import com.string.encryption.annotation.StringEncryption;

/**
 * On 2021-07-13
 */

@StringEncryption()
class TestEnc {

    @EncryptString("source string")
    String toEnc;
}
