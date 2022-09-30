TYPE=VIEW
query=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`trasladobod`.`cantidad`),\'0\',`bdclick1`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`trasladobod` on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`trasladobod`.`producto`))) group by `bdclick1`.`bdproductos`.`idSistema`
md5=fdf0a91e7be4ef8e96239af14ecdb193
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`trasladobod`.`cantidad`),\'0\',`trasladobod`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `trasladobod` on((`bdproductos`.`idSistema` = `trasladobod`.`producto`))) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`trasladobod`.`cantidad`),\'0\',`bdclick1`.`trasladobod`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`trasladobod` on((`bdclick1`.`bdproductos`.`idSistema` = `bdclick1`.`trasladobod`.`producto`))) group by `bdclick1`.`bdproductos`.`idSistema`
mariadb-version=100135
