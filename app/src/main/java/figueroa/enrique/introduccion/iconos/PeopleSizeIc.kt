package figueroa.enrique.introduccion.iconos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Suppress("CheckReturnValue")
val PeopleSizeIc: ImageVector
    get() {
        if (_people_size_increase != null) {
            return _people_size_increase!!
        }
        _people_size_increase =
            ImageVector.Builder(
                name = "people_size_increase",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.Companion.NonZero,
                    ) {
                        moveTo(17.5f, 20f)
                        verticalLineTo(14.5f)
                        horizontalLineTo(16f)
                        verticalLineTo(9.55f)
                        quadTo(16f, 9.17f, 16.2f, 8.89f)
                        reflectiveQuadTo(16.78f, 8.4f)
                        reflectiveQuadTo(17.71f, 8.1f)
                        reflectiveQuadTo(19f, 8f)
                        quadToRelative(0.73f, 0f, 1.29f, 0.1f)
                        reflectiveQuadToRelative(0.94f, 0.3f)
                        reflectiveQuadTo(21.8f, 8.89f)
                        reflectiveQuadTo(22f, 9.55f)
                        verticalLineTo(14.5f)
                        horizontalLineTo(20.5f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(-3f)
                        close()
                        moveTo(19f, 7f)
                        quadTo(18.28f, 7f, 17.76f, 6.49f)
                        quadTo(17.25f, 5.97f, 17.25f, 5.25f)
                        quadToRelative(0f, -0.73f, 0.51f, -1.24f)
                        quadTo(18.28f, 3.5f, 19f, 3.5f)
                        quadToRelative(0.73f, 0f, 1.24f, 0.51f)
                        reflectiveQuadToRelative(0.51f, 1.24f)
                        quadToRelative(0f, 0.72f, -0.51f, 1.24f)
                        reflectiveQuadTo(19f, 7f)
                        close()
                        moveTo(11.5f, 9f)
                        quadTo(10.88f, 9f, 10.44f, 8.56f)
                        reflectiveQuadTo(10f, 7.5f)
                        reflectiveQuadTo(10.44f, 6.44f)
                        reflectiveQuadTo(11.5f, 6f)
                        reflectiveQuadToRelative(1.06f, 0.44f)
                        reflectiveQuadTo(13f, 7.5f)
                        reflectiveQuadTo(12.56f, 8.56f)
                        reflectiveQuadTo(11.5f, 9f)
                        close()
                        moveToRelative(-7f, 1.75f)
                        quadToRelative(-0.52f, 0f, -0.89f, -0.36f)
                        reflectiveQuadTo(3.25f, 9.5f)
                        reflectiveQuadTo(3.61f, 8.61f)
                        reflectiveQuadTo(4.5f, 8.25f)
                        reflectiveQuadTo(5.39f, 8.61f)
                        quadTo(5.75f, 8.98f, 5.75f, 9.5f)
                        quadToRelative(0f, 0.52f, -0.36f, 0.89f)
                        reflectiveQuadTo(4.5f, 10.75f)
                        close()
                        moveTo(10.25f, 20f)
                        verticalLineTo(15.5f)
                        horizontalLineTo(8.75f)
                        verticalLineTo(11.4f)
                        quadToRelative(0f, -0.35f, 0.18f, -0.61f)
                        quadTo(9.1f, 10.52f, 9.45f, 10.35f)
                        quadTo(9.8f, 10.17f, 10.33f, 10.09f)
                        reflectiveQuadTo(11.5f, 10f)
                        reflectiveQuadToRelative(1.18f, 0.09f)
                        reflectiveQuadToRelative(0.88f, 0.26f)
                        quadToRelative(0.35f, 0.17f, 0.53f, 0.44f)
                        reflectiveQuadToRelative(0.17f, 0.61f)
                        verticalLineToRelative(4.1f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(-2.5f)
                        close()
                        moveTo(3.5f, 20f)
                        verticalLineTo(16.5f)
                        horizontalLineTo(2f)
                        verticalLineTo(12.77f)
                        quadToRelative(0f, -0.3f, 0.16f, -0.54f)
                        reflectiveQuadTo(2.65f, 11.83f)
                        reflectiveQuadTo(3.44f, 11.58f)
                        reflectiveQuadTo(4.5f, 11.5f)
                        reflectiveQuadToRelative(1.06f, 0.07f)
                        reflectiveQuadToRelative(0.79f, 0.25f)
                        reflectiveQuadToRelative(0.49f, 0.41f)
                        quadTo(7f, 12.48f, 7f, 12.77f)
                        verticalLineTo(16.5f)
                        horizontalLineTo(5.5f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(-2f)
                        close()
                    }
                }
                .build()
        return _people_size_increase!!
    }

private var _people_size_increase: ImageVector? = null