import Swal from 'sweetalert2';

/**
 * SweetAlert2 載入提示 Composable
 * 用於統一管理全域的 Loading 彈窗
 */
export const useSwalLoading = () => {
  const showLoading = (title: string = "Loading...", html: string = "Please wait...") => {
    Swal.fire({
      title,
      html,
      allowOutsideClick: false,
      didOpen: () => {
        Swal.showLoading();
      }
    });
  };

  const hideLoading = () => {
    Swal.close();
  };

  const confirmFire = async (title: string = "確認?", confirmFunction: Function = () => {}, confirmDataItemKey: any) => {
    const result = await Swal.fire({
      title: title,
      icon: 'question',
      confirmButtonText: 'Yes',
      cancelButtonText: 'No',
      showCancelButton: true,
      showCloseButton: true
    });
    if (result.isConfirmed) {
      await confirmFunction(confirmDataItemKey);
    }
  }
  
  return {
    showLoading,
    hideLoading,
    confirmFire
  };
};