package com.catalogue.cleanarchitecture;

import org.junit.jupiter.api.Test;// Test class added ONLY to cover main() invocation not covered by application tests.

public class SpringBootServiceTest {

    @Test
    public void main() {
        SpringBootService.main(new String[]{});
    }

}
