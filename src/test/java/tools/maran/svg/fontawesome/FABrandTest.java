package tools.maran.svg.fontawesome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/// Smoke tests for {@link FABrand}.
///
/// @author Marius Hanl
class FABrandTest {

    @ParameterizedTest
    @EnumSource(FABrand.class)
    @DisplayName("Smoke test for the SVG path. Font Awesome SVGs always start with an 'M' and end with a 'z'.")
    void testSvgPath(FABrand faBrand) {
        assertNotNull(faBrand.path());
        assertFalse(faBrand.path().isEmpty());

        assertTrue(faBrand.path().startsWith("M"));
        assertTrue(faBrand.path().endsWith("z"));
    }

}
