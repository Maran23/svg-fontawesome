package tools.maran.svg.fontawesome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/// Smoke tests for {@link FARegular}.
///
/// @author Marius Hanl
class FARegularTest {

    @ParameterizedTest
    @EnumSource(FARegular.class)
    @DisplayName("Smoke test for the SVG path. Font Awesome SVGs always start with an 'M' and end with a 'z'.")
    void testSvgPath(FARegular faRegular) {
        assertNotNull(faRegular.path());
        assertFalse(faRegular.path().isEmpty());

        assertTrue(faRegular.path().startsWith("M"));
        assertTrue(faRegular.path().endsWith("z"));
    }

}
