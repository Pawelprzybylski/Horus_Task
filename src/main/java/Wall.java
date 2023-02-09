import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {

  private List<Block> blocks;
  Block block;
  CompositeBlock compositeBlock;

  @Override
  public Optional<Block> findBlockByColor(String color) {

    return compositeBlock
        .getBlocks()
        .stream()
        .filter(blockByColor -> color.equals(block.getColor()))
        .findAny();

  }

  @Override
  public List<Block> findBlocksByMaterial(String material) {

    return compositeBlock
        .getBlocks()
        .stream()
        .filter(blocksByMaterial -> material.equals(block.getMaterial()))
        .collect(Collectors.toList());

  }

  @Override
  public int count() {
    return blocks.size();
  }

}
