package org.openstreetmap.atlas.tags;

import org.openstreetmap.atlas.tags.annotations.Tag;
import org.openstreetmap.atlas.tags.annotations.TagKey;
import org.openstreetmap.atlas.tags.annotations.validation.Validators;

/**
 * Tag identifies small sections of dual-carriageways and is NOT an OSM tag.
 *
 * @author sayas01
 */
@Tag(synthetic = true)
public enum SyntheticDualCarriageSectionTag
{
    YES;

    // Suppress sonar
    @TagKey
    public static final String KEY = "synthetic_invalid_way_section";

    public static boolean isYes(final Taggable taggable)
    {
        return Validators.isOfType(taggable, SyntheticDualCarriageSectionTag.class, YES);
    }
}
