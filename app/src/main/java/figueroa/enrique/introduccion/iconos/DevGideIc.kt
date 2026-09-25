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
val DevGideIc: ImageVector
    get() {
        if (_developer_guide != null) {
            return _developer_guide!!
        }
        _developer_guide =
            ImageVector.Builder(
                name = "developer_guide",
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
                        moveTo(5f, 21f)
                        quadTo(4.18f, 21f, 3.59f, 20.41f)
                        reflectiveQuadTo(3f, 19f)
                        verticalLineTo(5f)
                        quadTo(3f, 4.17f, 3.59f, 3.59f)
                        reflectiveQuadTo(5f, 3f)
                        horizontalLineTo(19f)
                        quadToRelative(0.83f, 0f, 1.41f, 0.59f)
                        reflectiveQuadTo(21f, 5f)
                        verticalLineTo(19f)
                        quadToRelative(0f, 0.82f, -0.59f, 1.41f)
                        reflectiveQuadTo(19f, 21f)
                        horizontalLineTo(5f)
                        close()
                        moveTo(5f, 5f)
                        verticalLineTo(19f)
                        horizontalLineTo(19f)
                        verticalLineTo(5f)
                        horizontalLineTo(17f)
                        verticalLineToRelative(7f)
                        lineTo(14.5f, 10.5f)
                        lineTo(12f, 12f)
                        verticalLineTo(5f)
                        horizontalLineTo(5f)
                        close()
                        moveTo(5f, 19f)
                        verticalLineTo(5f)
                        verticalLineTo(19f)
                        close()
                    }
                }
                .build()
        return _developer_guide!!
    }

private var _developer_guide: ImageVector? = null