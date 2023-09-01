package cloud.ffeng.user.infra.repository;

import cloud.ffeng.user.domain.platform.aggregate.PlatformAuthFlow;
import cloud.ffeng.user.domain.platform.repository.PlatformAuthRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author cat-feng
 */
@Slf4j
@Repository
@AllArgsConstructor
public class PlatformAuthRepositoryImpl implements PlatformAuthRepository {
    @Override
    public PlatformAuthFlow get(String platformAuthFlowId) {
        return new PlatformAuthFlow();
    }


    @Override
    public PlatformAuthFlow save(PlatformAuthFlow platformAuthFlow) {
        // countByUniqueKey() > 0
        //  update
        //   < 1
        //  insert
        return null;
    }

//
//    public static void convert(String pdfFilePath, String imageFilePath) throws IOException {
//        PDDocument document = null;
//        try {
//            // 加载 PDF 文件
//            document = PDDocument.load(new File(pdfFilePath));
//            // 创建 PDF 渲染器
//            PDFRenderer renderer = new PDFRenderer(document);
//            // 循环将每一页 PDF 转换为图片
//            for (int pageIndex = 0; pageIndex < document.getNumberOfPages(); pageIndex++) {
//                BufferedImage image = renderer.renderImageWithDPI(pageIndex, 300, ImageType.RGB);;
//                // 将图片保存为文件
//                ImageIO.write(image, "png", new File(imageFilePath + "-" + (pageIndex + 1) + ".png"));
//            }
//        } finally {
//            if (document != null) {
//                document.close();
//            }
//        }
//    }

}
