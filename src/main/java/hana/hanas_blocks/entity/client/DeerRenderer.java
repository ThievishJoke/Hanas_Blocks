package hana.hanas_blocks.entity.client;

//import hana.hanas_blocks.HanasBlocks;
//import hana.hanas_blocks.entity.custom.DeerEntity;
//import net.minecraft.client.render.VertexConsumerProvider;
//import net.minecraft.client.render.entity.EntityRendererFactory;
//import net.minecraft.client.render.entity.MobEntityRenderer;
//import net.minecraft.client.util.math.MatrixStack;
//import net.minecraft.util.Identifier;
//
//public class DeerRenderer extends MobEntityRenderer<DeerEntity, DeerModel<DeerEntity>> {
//    private static final Identifier TEXTURE = new Identifier(HanasBlocks.MOD_ID, "textures/entity/deer.png");
//
//    public DeerRenderer(EntityRendererFactory.Context context) {
//        super(context, new DeerModel<>(context.getPart(ModModelLayers.DEER)), 0.9f);
//    }
//    
//    @Override
//    public Identifier getTexture(DeerEntity entity) {
//        return TEXTURE;
//    }
//
//    @Override
//    public void render(DeerEntity mobEntity, float f, float g, MatrixStack matrixStack, 
//            VertexConsumerProvider vertexConsumerProvider, int i ) {
//        if(mobEntity.isBaby()) {
//            matrixStack.scale(0.6f, 0.6f, 0.6f);
//        } else {
//            matrixStack.scale(1f, 1f, 1f);
//        }
//
//        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
//    }
//}
//