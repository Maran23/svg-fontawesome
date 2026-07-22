# SVG Font Awesome

A collection of all [Font Awesome](https://fontawesome.com) Free SVG icon paths as Java enum constants – ready to be used in any Java program.

![FontAwesome](https://github.com/Maran23/svgnode/blob/demo/demo/library_fontawesome.webp)

## Features

- 🎨 All Font Awesome Free icons as Java enums — Solid, Regular, and Brands
- 🔗 No dependencies
- 📐 Designed as a companion library for [SvgNode](https://github.com/Maran23/svgnode) for use in JavaFX applications - but works in any Java context

## Installation

### Requirements

| Dependency | Version |
|------------|---------|
| Java       | 25+     |

### Maven

```xml
<dependency>
    <groupId>tools.maran</groupId>
    <artifactId>svg-fontawesome</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

```groovy
implementation 'tools.maran:svg-fontawesome:1.0.0'
```

## Usage

### Pure Java

```java
import tools.maran.svg.fontawesome.FASolid;

String path = FASolid.HOME.path();
```

#### With the SVG type

```java
import tools.maran.svg.SVG;
import tools.maran.svg.fontawesome.FARegular;
import tools.maran.svg.fontawesome.FASolid;

SVG svg = FASolid.HOME;
// Switch from solid to regular SVG.
svg = FARegular.HOME;
```

### Usage with [SvgNode](https://github.com/Maran23/svgnode)

#### Java

```java
import tools.maran.svgnode.SvgNode;
import tools.maran.svg.fontawesome.FASolid;

SvgNode node = new SvgNode(FASolid.HOME.path(), 32);
```
#### FXML

```xml
<?import tools.maran.svgnode.SvgNode?>
<?import tools.maran.svg.fontawesome.FASolid?>

<SvgNode size="32" color="RED">
    <path>
        <FASolid fx:constant="HOME"/>
    </path>
</SvgNode>
```

## Acknowledgements

This project includes SVG icon data from [Font Awesome](https://fontawesome.com),
licensed under [CC BY 4.0](https://creativecommons.org/licenses/by/4.0/).

See also: [Font Awesome License](https://fontawesome.com/license/free)
