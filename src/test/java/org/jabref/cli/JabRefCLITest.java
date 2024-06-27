package org.jabref.cli;

import java.util.Collections;
import java.util.List;

import javafx.util.Pair;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class JabRefCLITest {

    private final String bibtex = "@article{test, title=\"test title\"}";

    @Test
    void emptyCLILeftOversLongOptions() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"--nogui", "--import=some/file", "--output=some/export/file"});

        assertEquals(Collections.emptyList(), cli.getLeftOver());
    }

    @Test
    void guiIsDisabledLongOptions() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"--nogui", "--import=some/file", "--output=some/export/file"});

        assertTrue(cli.isDisableGui());
    }

    @Test
    void successfulParsingOfFileImportCLILongOptions() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"--nogui", "--import=some/file", "--output=some/export/file"});

        assertEquals("some/file", cli.getFileImport());
    }

    @Test
    void successfulParsingOfFileExportCLILongOptions() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"--nogui", "--import=some/file", "--output=some/export/file"});

        assertEquals("some/export/file", cli.getFileExport());
    }

    @Test
    void emptyCLILeftOversShortOptions() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-n", "-i=some/file", "-o=some/export/file"});

        assertEquals(Collections.emptyList(), cli.getLeftOver());
    }

    @Test
    void guiIsDisabledShortOptions() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-n", "-i=some/file", "-o=some/export/file"});

        assertTrue(cli.isDisableGui());
    }

    @Test
    void successfulParsingOfFileImportShortOptions() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-n", "-i=some/file", "-o=some/export/file"});

        assertEquals("some/file", cli.getFileImport());
    }

    @Test
    void successfulParsingOfFileExportShortOptions() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-n", "-i=some/file", "-o=some/export/file"});

        assertEquals("some/export/file", cli.getFileExport());
    }

    @Test
    void emptyPreferencesLeftOver() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-n", "-x=some/file"});

        assertEquals(Collections.emptyList(), cli.getLeftOver());
    }

    @Test
    void successfulExportOfPreferences() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-n", "-x=some/file"});

        assertEquals("some/file", cli.getPreferencesExport());
    }

    @Test
    void guiDisabledForPreferencesExport() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-n", "-x=some/file"});

        assertTrue(cli.isDisableGui());
    }

    @Test
    void emptyLeftOversCLIShortImportingBibtex() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-ib", bibtex});

        assertEquals(Collections.emptyList(), cli.getLeftOver());
    }

    @Test
    void recognizesImportBibtexShort() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-ib", bibtex});

        assertTrue(cli.isBibtexImport());
    }

    @Test
    void successfulParsingOfBibtexImportShort() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-ib", bibtex});

        assertEquals(bibtex, cli.getBibtexImport());
    }

    @Test
    void emptyLeftOversCLILongImportingBibtex() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-importBibtex", bibtex});

        assertEquals(Collections.emptyList(), cli.getLeftOver());
    }

    @Test
    void recognizesImportBibtexLong() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-importBibtex", bibtex});

        assertTrue(cli.isBibtexImport());
    }

    @Test
    void successfulParsingOfBibtexImportLong() throws Exception {
        JabRefCLI cli = new JabRefCLI(new String[]{"-importBibtex", bibtex});

        assertEquals(bibtex, cli.getBibtexImport());
    }

    @Test
    void alignStringTable() {
        List<Pair<String, String>> given = List.of(
                new Pair<>("Apple", "Slice"),
                new Pair<>("Bread", "Loaf"),
                new Pair<>("Paper", "Sheet"),
                new Pair<>("Country", "County"));

        String expected = """
                Apple   : Slice
                Bread   : Loaf
                Paper   : Sheet
                Country : County
                """;

        assertEquals(expected, JabRefCLI.alignStringTable(given));
    }

    private CommandLine cl;
    private JabRefCLI jabRefCLI;

    @BeforeEach
    void setup() throws ParseException, NoSuchFieldException, IllegalAccessException {
        cl = Mockito.mock(CommandLine.class);
        jabRefCLI = new JabRefCLI(new String[0]);

        java.lang.reflect.Field clField = JabRefCLI.class.getDeclaredField("cl");
        clField.setAccessible(true);

        clField.set(jabRefCLI, cl);
    }

    @Test
    void testGetWriteMetadatatoPdf_WriteMetadatatoPdf() {
        when(cl.hasOption("writeMetadatatoPdf")).thenReturn(true);
        when(cl.getOptionValue("writeMetadatatoPdf")).thenReturn("Metadata_value");

        assertEquals("Metadata_value", jabRefCLI.getWriteMetadatatoPdf());

        System.out.println("testing branch_00:");
        JabRefCLI.printCov();
        JabRefCLI.resetCov();
    }

    @Test
    void testGetWriteMetadatatoPdf_WriteXMPtoPdf() {
        when(cl.hasOption("writeMetadatatoPdf")).thenReturn(false);
        when(cl.hasOption("writeXMPtoPdf")).thenReturn(true);
        when(cl.getOptionValue("writeXMPtoPdf")).thenReturn("XMP_value");

        assertEquals("XMP_value", jabRefCLI.getWriteMetadatatoPdf());

        System.out.println( "testing branch_01: " );
        JabRefCLI.printCov();
        JabRefCLI.resetCov();
    }

    @Test
    void testGetWriteMetadatatoPdf_EmbeddBibfileInPdf() {
        when(cl.hasOption("writeMetadatatoPdf")).thenReturn(false);
        when(cl.hasOption("writeXMPtoPdf")).thenReturn(false);
        when(cl.hasOption("embeddBibfileInPdf")).thenReturn(true);
        when(cl.getOptionValue("embeddBibfileInPdf")).thenReturn("embeddBibfile_value");

        assertEquals("embeddBibfile_value", jabRefCLI.getWriteMetadatatoPdf());

        System.out.println( "testing branch_02: " );
        JabRefCLI.printCov();
        JabRefCLI.resetCov();
    }

    @Test
    void testGetWriteMetadatatoPdf_Null() {
        when(cl.hasOption("writeMetadatatoPdf")).thenReturn(false);
        when(cl.hasOption("writeXMPtoPdf")).thenReturn(false);
        when(cl.hasOption("embeddBibfileInPdf")).thenReturn(false);

        assertNull(jabRefCLI.getWriteMetadatatoPdf());

        System.out.println( "testing branch_03: " );
        JabRefCLI.printCov();
        JabRefCLI.resetCov();
    }
}
