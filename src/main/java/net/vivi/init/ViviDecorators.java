package net.vivi.init;

import net.minecraft.world.gen.decorator.ConfiguredDecorator;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;

public class ViviDecorators {
    public ConfiguredDecorator<CountExtraDecoratorConfig> denseTrees = Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(3, 0.1f, 1));
    public ConfiguredDecorator<CountExtraDecoratorConfig> sparseTrees = Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(0, 0.2f, 2));
    public ConfiguredDecorator<CountExtraDecoratorConfig> rareTrees = Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(0, 0.025f, 1));

}
