TYPE=VIEW
query=(select `bdclick2`.`bdcompra`.`producto` AS `producto`,sum(`bdclick2`.`bdcompra`.`cantidad`) AS `cant`,`bdclick2`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick2`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick2`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick2`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick2`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick2`.`bdingreso` left join `bdclick2`.`bdcompra` on((`bdclick2`.`bdcompra`.`ingreso` = `bdclick2`.`bdingreso`.`id`))) group by `bdclick2`.`bdcompra`.`producto`,`bdclick2`.`bdingreso`.`anulada`,month(`bdclick2`.`bdingreso`.`fechaFactura`),year(`bdclick2`.`bdingreso`.`fechaFactura`) having (`bdclick2`.`bdingreso`.`anulada` = 0))
md5=cfae4903ef24057966c21cb9a6caba50
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:43
create-version=2
source=(select `bdcompra`.`producto` AS `producto`,sum(`bdcompra`.`cantidad`) AS `cant`,`bdingreso`.`anulada` AS `anulada`,month(`bdingreso`.`fechaFactura`) AS `mes`,year(`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdcompra`.`subtotal`) AS `total`,sum(`bdcompra`.`total`) AS `totalSimplificado` from (`bdingreso` left join `bdcompra` on((`bdcompra`.`ingreso` = `bdingreso`.`id`))) group by `bdcompra`.`producto`,`bdingreso`.`anulada`,month(`bdingreso`.`fechaFactura`),year(`bdingreso`.`fechaFactura`) having (`bdingreso`.`anulada` = 0))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdcompra`.`producto` AS `producto`,sum(`bdclick2`.`bdcompra`.`cantidad`) AS `cant`,`bdclick2`.`bdingreso`.`anulada` AS `anulada`,month(`bdclick2`.`bdingreso`.`fechaFactura`) AS `mes`,year(`bdclick2`.`bdingreso`.`fechaFactura`) AS `ano`,sum(`bdclick2`.`bdcompra`.`subtotal`) AS `total`,sum(`bdclick2`.`bdcompra`.`total`) AS `totalSimplificado` from (`bdclick2`.`bdingreso` left join `bdclick2`.`bdcompra` on((`bdclick2`.`bdcompra`.`ingreso` = `bdclick2`.`bdingreso`.`id`))) group by `bdclick2`.`bdcompra`.`producto`,`bdclick2`.`bdingreso`.`anulada`,month(`bdclick2`.`bdingreso`.`fechaFactura`),year(`bdclick2`.`bdingreso`.`fechaFactura`) having (`bdclick2`.`bdingreso`.`anulada` = 0))
mariadb-version=100135
