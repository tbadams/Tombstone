package com.tadams.pcg.tomb.model;

import org.apache.commons.lang.WordUtils;

import java.util.Random;

/**
 * List of Gods that can kill player.
 * Created by tadams on 1/15/16.
 */
enum God {
    JEHOVAH,
    SATAN,
    ZEUS,
    HERA,
    HADES,
    POSEIDON,
    ARES,
    ATHENA,
    HERMES,
    MERCURY,
    VENUS,
    MARS,
    TYR,
    ODIN,
    LOKI,
    PTAH,
    THOTH,
    ANHUR,
    ANUBIS,
    RA,
    QUETZALCOATL,
    ANU,
    ISHTAR,
    ANSHAR,
    TIAMAT,
    MARDUK,
    TLALOC,
    FRIGG,
    FREYJA,
    HEL,
    BALDUR,
    MITRA,
    CROM,
    SET,
    LUGH,
    BRIGIT,
    MANANNAN_MAC_LIR,
    SHAN_LAI_CHING,
    CHIH_SUNG_TZU,
    HUAN_TI,
    AMATERASU_OMIKAMI,
    RAIJIN,
    SUSANOWO,
    SEKHMET,
    HORUS,
    SETH,
    OSIRIS,
    AMUN,
    BASTET;

    static God random(Random random) {
        return values()[random.nextInt(values().length)];
    }

    String getName() {
        return WordUtils.capitalizeFully(toString());
    }
}
