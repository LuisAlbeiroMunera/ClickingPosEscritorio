TYPE=VIEW
query=(select `bdclick`.`bdcompra`.`producto` AS `producto`,sum(`bdclick`.`bdcompra`.`cantidad`) AS `cant`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick`.`bdingreso` left join `bdclick`.`bdcompra` on((`bdclick`.`bdcompra`.`ingreso` = `bdclick`.`bdingreso`.`id`))) group by `bdclick`.`bdcompra`.`producto`,`bdclick`.`bdingreso`.`anulada`,month(`bdclick`.`bdingreso`.`fechaFactura`),year(`bdclick`.`bdingreso`.`fechaFactura`) having (`bdclick`.`bdingreso`.`anulada` = 0))
md5=203ccbf36916636d8f361e083171ddd7
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:22
create-version=2
source=(select `bdcompra`.`producto` AS `producto`,sum(`bdcompra`.`cantidad`) AS `cant`,`bdingreso`.`anulada` AS `anulada`,month(`bdingreso`.`fechaFactura`) AS `mes`,year(`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdcompra`.`subtotal`) AS `total`,sum(`bdcompra`.`total`) AS `totalSimplificado` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) group by `bdcompra`.`producto`,`bdingreso`.`anulada`,month(`bdingreso`.`fechaFactura`),year(`bdingreso`.`fechaFactura`) having (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdcompra`.`producto` AS `producto`,sum(`bdclick`.`bdcompra`.`cantidad`) AS `cant`,`bdclick`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick`.`bdingreso` left join `bdclick`.`bdcompra` on((`bdclick`.`bdcompra`.`ingreso` = `bdclick`.`bdingreso`.`id`))) group by `bdclick`.`bdcompra`.`producto`,`bdclick`.`bdingreso`.`anulada`,month(`bdclick`.`bdingreso`.`fechaFactura`),year(`bdclick`.`bdingreso`.`fechaFactura`) having (`bdclick`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
