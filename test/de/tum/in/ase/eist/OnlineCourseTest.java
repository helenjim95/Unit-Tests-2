package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {

	// 3: Test setOnlineCourseUrl()
    @Test
    void testSetOnlineCourseUrlWithValidUrl() throws MalformedURLException {
        OnlineCourse onlineCourse = new OnlineCourse("Netflix");
        onlineCourse.setUrl("https://www.netflix.com/browse");
        assertThrows(MalformedURLException.class, () -> { onlineCourse.setUrl("https://www.netflix.com/browse"); });
        URL expected = new URL("https://www.netflix.com/browse");
        URL observed = onlineCourse.getUrl();
        assertEquals(expected, observed);
    }

    @Test
    void testSetOnlineCourseUrlWithInvalidUrl() {
        OnlineCourse onlineCourse = new OnlineCourse("Netflix");
        assertThrows(MalformedURLException.class, () -> { onlineCourse.setUrl("www.netflix.comdsdsd"); });
    }
}
