package tools.maran.svg.fontawesome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/// Smoke tests for {@link FASolid}.
///
/// @author Marius Hanl
class FASolidTest {

    @ParameterizedTest
    @EnumSource(FASolid.class)
    @DisplayName("Smoke test for the SVG path. Font Awesome SVGs always start with an 'M' and end with a 'z'.")
    void testSvgPath(FASolid faSolid) {
        assertNotNull(faSolid.path());
        assertFalse(faSolid.path().isEmpty());

        assertTrue(faSolid.path().startsWith("M"));
        assertTrue(faSolid.path().endsWith("z"));
    }

}
